package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.translator.dao.mapper.attach.ContributionValueAttachMapper;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValueCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrContributionValueMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCContributionValueAtomSV;

@Component
public class YCContributionValueAtomSVImpl implements IYCContributionValueAtomSV{
	
	@Autowired
	private transient UsrContributionValueMapper contributionValueMapper;
	
	@Autowired
	private ContributionValueAttachMapper contributionAttachMapper;
	
	@Override
	public int insertContributionValue(UsrContributionValue valueInfo)
			throws BusinessException, SystemException {
		return contributionValueMapper.insertSelective(valueInfo);
	}

	@Override
	public List<UsrContributionValue> queryContributionValue(
			UsrContributionValueCriteria example) throws BusinessException,
			SystemException {
		return contributionValueMapper.selectByExample(example);
	}

	@Override
	public int getContributionValueSum(String userId) {
		return contributionAttachMapper.getContributionValueSum(userId);
	}

	@Override
	public int getContributionValueCount(UsrContributionValueCriteria example)
			throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		return contributionValueMapper.countByExample(example);
	}

}
