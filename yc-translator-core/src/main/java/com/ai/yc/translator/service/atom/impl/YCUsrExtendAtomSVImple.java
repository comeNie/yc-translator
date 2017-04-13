package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrExtendMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCUsrExtendAtomSV;

@Component
public class YCUsrExtendAtomSVImple implements IYCUsrExtendAtomSV{
	@Autowired
	private transient UsrExtendMapper usrExtendMapper;
	@Override
	public int insertExtendValue(UsrExtend usrExtend) {
		return usrExtendMapper.insertSelective(usrExtend);
	}

	@Override
	public List<UsrExtend> queryExtendValue(UsrExtendCriteria example) {
		return usrExtendMapper.selectByExample(example);
	}

	@Override
	public int deleteExtendValue(UsrExtendCriteria example) {
		return usrExtendMapper.deleteByExample(example);
	}

}
