package com.ai.yc.translator.service.business.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.TraslatorCertificateInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.UsrLanguageMessage;
import com.ai.yc.translator.api.translatorservice.param.UsrLspMessage;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrCertificateMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrEducationMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrExtendMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrWorkMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageInfo;
import com.ai.yc.translator.dao.mapper.bo.UsrCertificate;
import com.ai.yc.translator.dao.mapper.bo.UsrEducation;
import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelation;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrWork;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;
import com.ai.yc.translator.service.atom.interfaces.IYCUserLanguageAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCTranslatorServiceBusiSV;
import com.ai.yc.translator.util.GsonSingleton;
import com.google.gson.reflect.TypeToken;
import com.sun.mail.iap.ResponseHandler;

@Service
@Transactional
public class YCTranslatorServiceBusiSVImpl implements IYCTranslatorServiceBusiSV {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(YCTranslatorServiceBusiSVImpl.class);

	@Autowired
	private GsonSingleton g;

	@Autowired
	private IYCTranslatorServiceAtomSV ycUSAtomSV;
	
	@Autowired
	private IYCUserLanguageAtomSV languageAtomSV;

	@Override
	public UsrTranslator searchYCUsrTranslatorInfo(SearchYCTranslatorRequest searchReq) throws BusinessException {
		if (StringUtil.isBlank(searchReq.getUserId()) && StringUtil.isBlank(searchReq.getTranslatorId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id与译员id不能同时为空");
		}
		if (!StringUtil.isBlank(searchReq.getUserId()) && !StringUtil.isBlank(searchReq.getTranslatorId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id与译员id不能同时存在");
		}
		UsrTranslator utr = null;
		try {
			if (!StringUtil.isBlank(searchReq.getUserId())) {
				utr = ycUSAtomSV.getUsrTranslatorInfo(searchReq.getUserId());
			} else {
				utr = ycUSAtomSV.getUsrTranslatorInfoByTranslatorId(searchReq.getTranslatorId());
			}
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		if (null == utr) {
			return null;
		}

		return utr;
	}

	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException {
		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户ID不能为空");
		}
		YCTranslatorSkillListResponse translatorSkillList = new YCTranslatorSkillListResponse();

		try {
			// 获取译员信息
			UsrTranslator utr = ycUSAtomSV.getUsrTranslatorInfo(userId);
			if (null == utr) {
				return translatorSkillList;
			}
			// 获取LSP信息
			UsrLspRelation ulr = ycUSAtomSV.getUsrLspRelationByTranslatorId(userId);
			if (null != ulr) {
				translatorSkillList.setLspId(ulr.getLspId());
				translatorSkillList.setLspRole(ulr.getTranslatorRole());
			}

			BeanUtils.copyProperties(translatorSkillList, utr);
			// 获取技能列表
			List<UsrLanguage> usrLanguageList = ycUSAtomSV.getUsrLanguageList(utr.getTranslatorId());
			translatorSkillList.setUsrLanguageList(changUsrLanguageToUsrLanguageMessage(usrLanguageList));
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}

		return translatorSkillList;
	}

	@Override
	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest params) {
		UsrLsp usrLsp = null;
		YCLSPInfoReponse yclspRep = new YCLSPInfoReponse();
		yclspRep.setLspId(params.getLspId());
		yclspRep.setLspName(params.getLspName());
		List<UsrLsp> usrLspList = new ArrayList<UsrLsp>();

		try {
			if (!StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
				usrLsp = ycUSAtomSV.searchLspById(params.getLspId());
				if (null == usrLsp) {
					return yclspRep;
				}
				yclspRep.setLspId(usrLsp.getLspId());
				yclspRep.setLspName(usrLsp.getLspName());
				usrLspList.add(usrLsp);
				yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
			}
			if (StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
				UsrLspCriteria example = new UsrLspCriteria();
				UsrLspCriteria.Criteria criteria = example.createCriteria();
				criteria.andLspNameLike(params.getLspName());
				usrLspList = ycUSAtomSV.searchLspByName(example);
				if (null == usrLspList) {
					return yclspRep;
				}
				if (null == usrLspList.get(0)) {
					return yclspRep;
				}
				yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
			}
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		if (StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数不能同时为空");
		}
		if (!StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数不能同时有值");
		}
		return yclspRep;
	}

	@Override
	public YCInsertTranslatorResponse insertTranslatorBusiness(InsertYCTranslatorRequest insertYCTranslatorParams)
			throws BusinessException {
		/*if (StringUtil.isBlank(insertYCTranslatorParams.getUserId())
				&& StringUtil.isBlank(insertYCTranslatorParams.getUsername())
				&& StringUtil.isBlank(insertYCTranslatorParams.getNickname())
				&& StringUtil.isBlank(insertYCTranslatorParams.getMobilePhone())
				&& StringUtil.isBlank(insertYCTranslatorParams.getEmail())
				&& StringUtil.isBlank(insertYCTranslatorParams.getLegalCertNum())
				&& StringUtil.isBlank(insertYCTranslatorParams.getMotherTongue())
				&& insertYCTranslatorParams.getWorkingLife() > 0
				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfExperise())
				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfUse())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "必填字段不能为空");
		}*/
		YCInsertTranslatorResponse itr = new YCInsertTranslatorResponse();

		UsrTranslator newTranslator = new UsrTranslator();
		BeanUtils.copyProperties(newTranslator, insertYCTranslatorParams);
		String translatorId = SeqUtil.getNewId("YC_TRANSLATOR_ID$SEQ", 10);
		newTranslator.setTranslatorId(translatorId);
		try {
			ycUSAtomSV.insertTranslatorInc(newTranslator);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}

		BeanUtils.copyProperties(itr, newTranslator);
		return itr;
	}

	@Override
	public YCUpdateTranslatorResponse updateTranslatorBusiness(UpdateYCTranslatorRequest updateYCTranslatorParams)
			throws BusinessException {
		YCUpdateTranslatorResponse response = new YCUpdateTranslatorResponse();
		// List<String> listValidator = beanValidator(updateYCTranslatorParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		UsrTranslator newTranslator = new UsrTranslator();
		BeanUtils.copyProperties(newTranslator, updateYCTranslatorParams);
		try {
			int updateTranslatorAtomResp = ycUSAtomSV.updateTranslatorInc(newTranslator);
			response.setUpdateCount(updateTranslatorAtomResp);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, e);
		}
		response.setTranslatorId(updateYCTranslatorParams.getTranslatorId());
		response.setUpdateCount(0);
		return response;
	}

	@Override
	public YCInsertLanguageSkillResponse insertLanguageSkillBusiness(InsertYCLanguageSkillRequest insertParams) {
		YCInsertLanguageSkillResponse response = new YCInsertLanguageSkillResponse();
		// List<String> listValidator = beanValidator(insertParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		// delete all translator
		ycUSAtomSV.deleteLanguageSkillByTranslator(insertParams.getTranslatorId());
		for (UsrLanguageMessage ulm : insertParams.getTranslatorLanguageSkill()) {
			ycUSAtomSV.insertTranslatorLanguageSkill(g.getGson().fromJson(g.getGson().toJson(ulm), UsrLanguage.class));
		}

		return response;
	}

	@Override
	public BaseResponse insertEduHistoryBusiness(InsertYCEduHistoryRequest insertParams) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSAtomSV.deleteEducationByTranslatorId(insertParams.getTranslatorId());
			for (UsrEducationMessage ulm : insertParams.getEducationList()) {
				ycUSAtomSV.insertEducation(g.getGson().fromJson(g.getGson().toJson(ulm), UsrEducation.class));
			}
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "插入成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "插入失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public YCSearchEduHistoryResponse searchEduHistoryBusiness(SearchYCEduHistoryRequest searchParams) {
		YCSearchEduHistoryResponse response = new YCSearchEduHistoryResponse();
		// List<String> listValidator = beanValidator(searchParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		List<UsrEducation> eduList = ycUSAtomSV.searchEduByTranslatorId(searchParams.getTranslatorId());

		response.setTranslatorId(searchParams.getTranslatorId());
		response.setTranslatorEduList(changUsrEduToUsrEduMessage(eduList));
		return response;
	}

	@Override
	public BaseResponse insertWorkExprienceBusiness(InsertYCWorkExprienceRequest insertParams) {
		BaseResponse response = new BaseResponse();
		
		ycUSAtomSV.deleteWorkExprienceByTranslatorId(insertParams.getTranslatorId());
		for (UsrWorkMessage ulm : insertParams.getTranslatorWork()) {
			ycUSAtomSV.insertWorkExprience(g.getGson().fromJson(g.getGson().toJson(ulm), UsrWork.class));
		}

		return response;
	}

	@Override
	public YCSearchWorkExprienceResponse searchWorkExperenceBusiness(SearchYCWorkExprienceRequest searchParams) {
		YCSearchWorkExprienceResponse response = new YCSearchWorkExprienceResponse();
		// List<String> listValidator = beanValidator(searchParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		List<UsrWork> workList = ycUSAtomSV.searchWorkByTranslatorId(searchParams.getTranslatorId());

		response.setTranslatorId(searchParams.getTranslatorId());
		response.setWorkList(changUsrWorkToUsrWorkMessage(workList));
		return response;
	}

	@Override
	public BaseResponse insertCertificateBusiness(InsertYCCertificationsRequest insertParams) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSAtomSV.deleteCertificateByTranslatorId(insertParams.getTranslatorId());
			for (UsrCertificateMessage ulm : insertParams.getCertificateList()) {
				ycUSAtomSV.insertTranslatorCertificate(g.getGson().fromJson(g.getGson().toJson(ulm), UsrCertificate.class));
			}
			header = new ResponseHeader(true,ExceptCodeConstants.Special.SUCCESS,"插入成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(true,ExceptCodeConstants.Special.SUCCESS,"插入失败");
		}
		response.setResponseHeader(header);

		return response;
	}

	@Override
	public YCInsertTranslatorExtendsListResponse insertExtendResponseBusiness(
			InsertYCTranslatorExtendsListRequest insertParams) {
		YCInsertTranslatorExtendsListResponse response = new YCInsertTranslatorExtendsListResponse();
		// List<String> listValidator = beanValidator(insertParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		// delete all translator
		ycUSAtomSV.deleteExtendByTranslatorId(insertParams.getTranslatorId());
		for (UsrExtendMessage ulm : insertParams.getExtendList()) {
			ycUSAtomSV.insertTranslatorExtend(g.getGson().fromJson(g.getGson().toJson(ulm), UsrExtend.class));
		}

		return response;
	}

	@Override
	public YCSearchCertificationsResponse searchCertificateBusiness(SearchYCCertificationsRequest searchParams) {
		YCSearchCertificationsResponse response = new YCSearchCertificationsResponse();
		// List<String> listValidator = beanValidator(searchParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		List<UsrCertificate> usrCertificateList = ycUSAtomSV
				.searchCertificateByTranslatorId(searchParams.getTranslatorId());

		response.setTranslatorId(searchParams.getTranslatorId());
		response.setCertificateList(changCertificateToCertificateMessage(usrCertificateList));
		return response;
	}

	@Override
	public YCSearchTranslatorExtendsListResponse searchExtendBusiness(
			SearchYCTranslatorExtendsListRequest searchParams) {
		YCSearchTranslatorExtendsListResponse response = new YCSearchTranslatorExtendsListResponse();
		// List<String> listValidator = beanValidator(searchParams);
		// if (listValidator != null && !listValidator.isEmpty()) {
		// throw new
		// BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL,
		// listValidator + "");
		// }
		List<UsrExtend> usrExtendList = ycUSAtomSV.searchExtendByTranslatorId(searchParams.getTranslatorId());

		response.setTranslatorId(searchParams.getTranslatorId());
		response.setExtendList(changExtendToExtendMessage(usrExtendList));
		return response;
	}

	private List<UsrExtendMessage> changExtendToExtendMessage(List<UsrExtend> extend) {
		Type type = new TypeToken<List<UsrExtendMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(extend), type);
	}

	private List<UsrCertificateMessage> changCertificateToCertificateMessage(List<UsrCertificate> certificate) {
		Type type = new TypeToken<List<UsrCertificateMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(certificate), type);
	}

	private List<UsrLanguageMessage> changUsrLanguageToUsrLanguageMessage(List<UsrLanguage> usrLanguageList) {
		Type type = new TypeToken<List<UsrLanguageMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(usrLanguageList), type);
	}

	private List<UsrLspMessage> changUsrLspToUsrLspMessage(List<UsrLsp> usrLspList) {
		Type type = new TypeToken<List<UsrLspMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(usrLspList), type);
	}

	private List<UsrEducationMessage> changUsrEduToUsrEduMessage(List<UsrEducation> usrEduList) {
		Type type = new TypeToken<List<UsrEducationMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(usrEduList), type);
	}

	private List<UsrWorkMessage> changUsrWorkToUsrWorkMessage(List<UsrWork> usrWorkList) {
		Type type = new TypeToken<List<UsrWorkMessage>>() {
		}.getType();
		return g.getGson().fromJson(g.getGson().toJson(usrWorkList), type);
	}

	@Override
	public YCUpdateTranslatorResponse updateTranslatorByUserId(UpdateYCTranslatorRequest updateYCTranslatorParams)
			throws BusinessException {
		ResponseHeader header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "修改成功");
		YCUpdateTranslatorResponse response = new YCUpdateTranslatorResponse();
		UsrTranslator newTranslator = new UsrTranslator();
		BeanUtils.copyProperties(newTranslator, updateYCTranslatorParams);
		try {
			UsrTranslatorCriteria example = new UsrTranslatorCriteria();
			UsrTranslatorCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(updateYCTranslatorParams.getUserId());
			int updateTranslatorAtomResp = ycUSAtomSV.updateTranslatorByUserId(newTranslator, example);
			response.setUpdateCount(updateTranslatorAtomResp);
		} catch (Exception e) {
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "修改失败");
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, e);
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse deleteTranslator(String translatorId) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSAtomSV.deleteTranslatorInfo(translatorId);
			ycUSAtomSV.deleteExtendByTranslatorId(translatorId);
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS,"删除成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS,"删除成功");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse insertCertificateInfo(TraslatorCertificateInfoRequest request) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		
		try{
			
			/**
			 * 语言对
			 */
			List<UsrLanguageInfo> languageList = request.getLanguageList();
			ycUSAtomSV.deleteLanguageSkillByTranslator(request.getUserId());
			for(int i=0;i<languageList.size();i++){
				UsrLanguageInfo language = languageList.get(i);
				UsrLanguage usrLanguage = new UsrLanguage();
				BeanUtils.copyProperties(usrLanguage, language);
				String languageId = SeqUtil.getNewId("YC_LANGUAGE_ID$SEQ", 8);
				usrLanguage.setLanguageId(languageId);
				languageAtomSV.insertUserLanguageInfo(usrLanguage);
			}
			/**
			 * 资质
			 */
			List<UsrCertificateMessage> cmessage = request.getCardResultList();
			ycUSAtomSV.deleteCertificateByTranslatorId(request.getUserId());
			for(int i =0;i<cmessage.size();i++){
				UsrCertificateMessage catem = cmessage.get(i);
				UsrCertificate usrCertificate = new UsrCertificate();
				String cer = SeqUtil.getNewId("YC_CER_ID$SEQ", 8);
				BeanUtils.copyProperties(usrCertificate, catem);
				usrCertificate.setCertificationId(cer);
				ycUSAtomSV.insertTranslatorCertificate(usrCertificate);
			}
			/**
			 * 教育
			 */
			ycUSAtomSV.deleteEducationByTranslatorId(request.getUserId());
			List<UsrEducationMessage> eduList = request.getEduResultList();
			for(int i =0;i<eduList.size();i++){
				UsrEducationMessage education = eduList.get(i);
				UsrEducation usrEducation = new UsrEducation();
				BeanUtils.copyProperties(usrEducation,education);
				String eduId = SeqUtil.getNewId("YC_EDU_ID$SEQ", 8);
				usrEducation.setEducationId(eduId);
				ycUSAtomSV.insertEducation(usrEducation);
			}
			/**
			 * 工作经验
			 */
			ycUSAtomSV.deleteWorkExprienceByTranslatorId(request.getUserId());
			List<UsrWorkMessage> workList = request.getWorkResultList();
			for(int i =0;i<workList.size();i++){
				UsrWorkMessage work = workList.get(i);
				UsrWork usrWork = new UsrWork();
				BeanUtils.copyProperties(usrWork,work);
				String workId = SeqUtil.getNewId("YC_WORK_ID$SEQ", 8);
				usrWork.setWorkId(workId);
				ycUSAtomSV.insertWorkExprience(usrWork);
			}
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS,"添加成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SUCCESS,"删除失败");
		}
		response.setResponseHeader(header);
		return response;
	}
}
