package com.main.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.provider.example.TestBean;

@SpringBootApplication
public class ConfigurationDemoApplication {
	
	public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigurationDemoApplication.class, args);
        TestBean bean = ctx.getBean(TestBean.class);
        System.out.println("Registered Bean: "+bean.getTestBean());

    }
	
}
