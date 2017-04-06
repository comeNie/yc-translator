package com.ai.yc.translator.service.business.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfo;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.service.atom.interfaces.ITranslatorInfoServiceAtomSV;
import com.ai.yc.translator.service.business.interfaces.ITranslatorInfoServiceBusiSV;
@Service
@Transactional
public class TranslatorInfoServiceBusiSVImpl implements ITranslatorInfoServiceBusiSV  {
	@Autowired
	private ITranslatorInfoServiceAtomSV ycTranslatorAtomSV;
	@Override
	public TranslatorInfoQueryResponse queryPageInfoTranslatorInfo(
			UsrTranslatorPageInfoRequest pageInfoRequest) {
		TranslatorInfoQueryResponse response = new TranslatorInfoQueryResponse();
		List<UsrTranslatorPageInfo> translatorInfoList = null;
		PageInfo<TranslatorInfo> translatorInfoPageInfo = new PageInfo<TranslatorInfo>();
		List<TranslatorInfo> list = new ArrayList<TranslatorInfo>();
		ResponseHeader header = null;
		try {
			int count  = ycTranslatorAtomSV.getTranslatorListCount(pageInfoRequest);
			int pageCount = count / pageInfoRequest.getPageNo() + (count % pageInfoRequest.getPageSize() > 0 ? 1 : 0);
			translatorInfoList = ycTranslatorAtomSV.queryCompanyInfoList(pageInfoRequest);
			if(translatorInfoList != null){
				for(int i=0;i<translatorInfoList.size();i++){				
					TranslatorInfo translatorInfo = new TranslatorInfo();
					UsrTranslatorPageInfo usrTranslator = translatorInfoList.get(i);
					BeanUtils.copyProperties(translatorInfo, usrTranslator);
					list.add(translatorInfo);
				}
			}
			translatorInfoPageInfo.setResult(list);
			translatorInfoPageInfo.setPageNo(pageInfoRequest.getPageNo());
			translatorInfoPageInfo.setPageSize(pageInfoRequest.getPageSize());
			translatorInfoPageInfo.setCount(count);
			translatorInfoPageInfo.setPageCount(pageCount);
			response.setPageInfo(translatorInfoPageInfo);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS, "查询译员信息成功");
		} catch (Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"查询译员信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}

}
