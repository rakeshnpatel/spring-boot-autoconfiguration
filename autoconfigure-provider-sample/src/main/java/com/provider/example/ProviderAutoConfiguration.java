package com.provider.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AC67870
 *
 */
@Configuration
public class ProviderAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean(TestBean.class)
	public TestBean testBean() {
		return new TestBean("from autoconfigure-provider-sample");
	}
	
}
