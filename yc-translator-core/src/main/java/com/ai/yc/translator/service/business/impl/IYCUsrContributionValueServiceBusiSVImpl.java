package com.ai.yc.translator.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValueInfo;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageRequest;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageResponse;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValueCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.service.atom.interfaces.IYCContributionValueAtomSV;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCContributionValueServiceBusiSV;

@Service
@Transactional
public class IYCUsrContributionValueServiceBusiSVImpl implements IYCContributionValueServiceBusiSV{

	@Autowired
	private IYCContributionValueAtomSV contributionValueAtomSV;
	
	@Autowired
	private IYCTranslatorServiceAtomSV translatorServiceAtomSV;
	
	@Override
	public BaseResponse insertContributionValue(
			UsrContributionValue valueInfo) throws BusinessException,
			SystemException {
		
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			/**
			 * 新增贡献值
			 */
			contributionValueAtomSV.insertContributionValue(valueInfo);
			/**
			 * 获取该userID用户的总贡献值
			 */
			int sum = contributionValueAtomSV.getContributionValueSum(valueInfo.getUserId());
			/**
			 * 更新译员贡献值
			 */
			UsrTranslator usrTranslator = new UsrTranslator();
			usrTranslator.setContributionValue(sum);
			if(sum>=0&&sum<59999){
				/**
				 * v1译员
				 */
				usrTranslator.setVipLevel("1");
			}else if(sum<149999){
				/**
				 * v2译员
				 */
				usrTranslator.setVipLevel("2");
			}else{
				/**
				 * v3译员
				 */
				usrTranslator.setVipLevel("3");
			}
			
			UsrTranslatorCriteria example = new UsrTranslatorCriteria();
			UsrTranslatorCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(valueInfo.getUserId());
			translatorServiceAtomSV.updateTranslatorByUserId(usrTranslator, example);
			
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增贡献值成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增贡献值失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UsrContributionValuePageResponse queryContributionValue(
			UsrContributionValuePageRequest request) throws BusinessException,
			SystemException {
		
		UsrContributionValuePageResponse response = new UsrContributionValuePageResponse();
		ResponseHeader header = null;
		
		List<UsrContributionValueInfo> resultList = new ArrayList<UsrContributionValueInfo>();
		List<UsrContributionValue> list = new ArrayList<UsrContributionValue>();
		PageInfo<UsrContributionValueInfo> pageInfo = new PageInfo<UsrContributionValueInfo>();
		try{
			UsrContributionValueCriteria example = new UsrContributionValueCriteria();
			UsrContributionValueCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(request.getUserId());
			list = contributionValueAtomSV.queryContributionValue(example);
			int count = contributionValueAtomSV.getContributionValueCount(example);
			for(int i=0;i<list.size();i++){
				UsrContributionValueInfo valueInfo = new UsrContributionValueInfo();
				UsrContributionValue value = list.get(i);
				BeanUtils.copyProperties(valueInfo, value);
				resultList.add(valueInfo);
			}
			pageInfo.setResult(resultList);
			pageInfo.setPageNo(request.getPageNo());
			pageInfo.setPageSize(request.getPageSize());
			pageInfo.setCount(count);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询贡献值成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "查询贡献值失败");
		}
		response.setUsrContributionValueInfoPage(pageInfo);
		response.setResponseHeader(header);
		return response;
	}
}
