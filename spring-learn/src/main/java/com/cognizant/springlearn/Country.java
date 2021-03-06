package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	String code;
	String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country() {
		super();
		LOGGER.info("inside Country Constructor");
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
