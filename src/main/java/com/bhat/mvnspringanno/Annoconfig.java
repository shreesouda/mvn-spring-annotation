package com.bhat.mvnspringanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bhat.mvnspringanno")
public class Annoconfig {
	
	/*@Bean
	public Samsung meth() {
		return new Samsung();
	}
	
	@Bean
	public Redmi meth2() {
		return new Redmi();
	}
	
	@Bean
	public Mobileprocessor meth3() {
		return new Snapdragon();
	}*/

}
