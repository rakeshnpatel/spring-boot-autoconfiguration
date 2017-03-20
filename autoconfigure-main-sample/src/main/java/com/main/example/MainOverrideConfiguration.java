package com.main.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.provider.example.TestBean;

@Configuration
public class MainOverrideConfiguration {

	// This will override the default bean provider from "autoconfigure-provider-sample" project
	// To test the default is available - comment this bean and restart the application. observe the console out.
	@Bean
	public TestBean testBean() {
		return new TestBean("from autoconfigure-main-sample");
	}
}
