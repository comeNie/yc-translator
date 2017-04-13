package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;

public interface IYCUsrExtendAtomSV {

	public int insertExtendValue(UsrExtend usrExtend);
	
	public List<UsrExtend> queryExtendValue(UsrExtendCriteria example);
	
	public int deleteExtendValue(UsrExtendCriteria example);
}
