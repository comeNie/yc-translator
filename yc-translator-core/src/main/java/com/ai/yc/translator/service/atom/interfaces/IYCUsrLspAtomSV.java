package com.ai.yc.translator.service.atom.interfaces;


import com.ai.yc.translator.dao.mapper.bo.UsrLsp;

import java.util.List;

public interface IYCUsrLspAtomSV {

	public List<UsrLsp> queryLspAccountInfo(String userId);
	
}
