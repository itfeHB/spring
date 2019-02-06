package com.bit.sts01.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaDaoImpl implements JavaDao {
	private static final Logger logger = LoggerFactory.getLogger(JavaDaoImpl.class);
	
	@Override
	public String func01() throws Exception {
		logger.debug("func01");
		if(1>0)throw new Exception();
		return "abc";
	}

	@Override
	public void func02() {
		logger.debug("func02");

	}

	@Override
	public void func03() {
		logger.debug("func03");

	}

}
