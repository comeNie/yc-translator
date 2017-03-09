package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValueCriteria;

public interface IYCContributionValueAtomSV {
	
	public int insertContributionValue(UsrContributionValue valueInfo) throws BusinessException,SystemException;
	
	public List<UsrContributionValue> queryContributionValue(UsrContributionValueCriteria example) throws BusinessException,SystemException;
	
	public int getContributionValueSum(String userId)throws BusinessException,SystemException;
	
	public int getContributionValueCount(UsrContributionValueCriteria example)throws BusinessException,SystemException;
	
}
