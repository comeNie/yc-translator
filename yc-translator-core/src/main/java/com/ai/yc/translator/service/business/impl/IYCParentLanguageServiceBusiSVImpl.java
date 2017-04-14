package com.ai.yc.translator.service.business.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.parentlanguage.param.UsrParentLanguageInfo;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguageCriteria;
import com.ai.yc.translator.service.atom.interfaces.IYCParentLanguageAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCParentLanguageServiceBusiSV;

@Service
@Transactional
public class IYCParentLanguageServiceBusiSVImpl implements IYCParentLanguageServiceBusiSV{
	@Autowired
	private IYCParentLanguageAtomSV parentLanguageAtomSV;
	
	@Override
	public BaseListResponse<UsrParentLanguageInfo> queryParentLanguage()
			throws BusinessException, SystemException {
		List<UsrParentLanguageInfo> list = new ArrayList<UsrParentLanguageInfo>();
		BaseListResponse<UsrParentLanguageInfo> listResponse = new BaseListResponse<UsrParentLanguageInfo>();
		ResponseHeader header = null;
		try{
			UsrParentLanguageCriteria example = new UsrParentLanguageCriteria();
			List<UsrParentLanguage> returnList = parentLanguageAtomSV.queryExtendValue(example);
			for(int i=0;i<returnList.size();i++){
				UsrParentLanguage parentLanguage = returnList.get(i);
				UsrParentLanguageInfo parentLanguageInfo = new UsrParentLanguageInfo();
				BeanUtils.copyProperties(parentLanguageInfo, parentLanguage);
				if("zh".equals(parentLanguage.getLanguage())){
					parentLanguageInfo.setNameZH(parentLanguage.getName());
				}else{
					parentLanguageInfo.setNameEN(parentLanguage.getName());
				}
				list.add(parentLanguageInfo);
			}
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"查询失败");
		}
		listResponse.setResult(list);
		listResponse.setResponseHeader(header);
		return listResponse;
	}

	

}
