package com.ai.yc.translator.api.allointerper.impl;

import org.springframework.stereotype.Component;

import com.ai.yc.translator.api.allointerper.intefaces.IYCAlloTranslatorServiceSV;
import com.ai.yc.translator.api.allointerper.param.AlloTranslatorRequest;
import com.ai.yc.translator.api.allointerper.param.AlloTranslatorResponse;
import com.alibaba.dubbo.config.annotation.Service;
@Service(validation = "true")
@Component
public class AlloTranslatorServiceSVImpl implements IYCAlloTranslatorServiceSV {

	@Override
	public AlloTranslatorResponse queryAlloTranslator(AlloTranslatorRequest request) {
		return null;
	}

}
