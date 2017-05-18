package com.ai.yc.translator.service.atom.impl;

import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrExtendMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLspMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCUsrExtendAtomSV;
import com.ai.yc.translator.service.atom.interfaces.IYCUsrLspAtomSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class YCUsrLspAtomSVImple implements IYCUsrLspAtomSV{
	@Autowired
	private transient UsrLspMapper usrLspMapper;
	@Override
	public List<UsrLsp> queryLspAccountInfo(String userId) {
		UsrLspCriteria example = new UsrLspCriteria();
		example.createCriteria().andTranslatorIdEqualTo(userId);
		List<UsrLsp> usrLsps = usrLspMapper.selectByExample(example);
		return usrLsps;
	}
}
