package com.provider.example;

import lombok.Data;

@Data
public class TestBean {

	private String testBean;
	
	public TestBean(String testBean) {
		this.testBean = testBean;
	}
}
