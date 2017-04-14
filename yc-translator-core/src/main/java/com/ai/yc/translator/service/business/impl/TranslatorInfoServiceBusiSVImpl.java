package com.ai.yc.translator.service.business.impl;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;
import com.ai.yc.translator.service.atom.interfaces.IYCUsrExtendAtomSV;
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
	@Autowired
	private IYCUsrExtendAtomSV usrExtendAtomSV;
	@Autowired
	private IYCTranslatorServiceAtomSV ycUSAtomSV;
	@Override
	public TranslatorInfoQueryResponse queryPageInfoTranslatorInfo(
			UsrTranslatorPageInfoRequest pageInfoRequest) {
		TranslatorInfoQueryResponse response = new TranslatorInfoQueryResponse();
		List<UsrTranslatorPageInfo> translatorInfoList = null;
		PageInfo<TranslatorInfo> translatorInfoPageInfo = new PageInfo<TranslatorInfo>();
		List<TranslatorInfo> list = new ArrayList<TranslatorInfo>();
//		List<UsrExtendInfo> returnList = new ArrayList<UsrExtendInfo>();
		ResponseHeader header = null;
		try {
			int count  = ycTranslatorAtomSV.getTranslatorListCount(pageInfoRequest);
			int pageCount = count / pageInfoRequest.getPageNo() + (count % pageInfoRequest.getPageSize() > 0 ? 1 : 0);
			translatorInfoList = ycTranslatorAtomSV.queryTranslatorInfoList(pageInfoRequest);
			if(translatorInfoList != null){
				for(int i=0;i<translatorInfoList.size();i++){
					UsrExtendCriteria example = new UsrExtendCriteria();
					UsrExtendCriteria.Criteria criteria = example.createCriteria();
					if(!StringUtil.isBlank(translatorInfoList.get(i).getTranslatorId())){
						criteria.andTranslatorIdEqualTo(translatorInfoList.get(i).getTranslatorId());
					}
					//领域
					String usrField = "";
					//用途
					String usrPurpose = "";
					//语言方向ID
					List<UsrLanguage> usrLanguageLists = ycUSAtomSV.getUsrLanguageList(translatorInfoList.get(i).getUserId());
					List<String> usrLanguageIDLists = new ArrayList<>();
					if (CollectionUtil.isEmpty(usrLanguageLists)){
						for (UsrLanguage usrLanguage: usrLanguageLists){
							usrLanguageIDLists.add(usrLanguage.getDuadId());
						}
					}
//					String usrLanguageList = StringUtil.join(usrLanguageLists.toArray(new String[usrLanguageLists.size()]), ",");
					List<UsrExtend> usrExtendList = usrExtendAtomSV.queryExtendValue(example);
					for (UsrExtend usrExtend: usrExtendList) {
						if ("1".equals(usrExtend.getExtendType())){
							usrField+=usrExtend.getExtendKey();
						}else if ("2".equals(usrExtend.getExtendType())){
							usrPurpose+=usrExtend.getExtendType();
						}
					}
					TranslatorInfo translatorInfo = new TranslatorInfo();
					UsrTranslatorPageInfo usrTranslator = translatorInfoList.get(i);
					BeanUtils.copyProperties(translatorInfo, usrTranslator);
					translatorInfo.setUsrField(usrField);
					translatorInfo.setUsrLanguagelist(usrLanguageIDLists);
//					translatorInfo.setUsrLanguages(usrLanguageList);
					translatorInfo.setUsrPurpose(usrPurpose);
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
