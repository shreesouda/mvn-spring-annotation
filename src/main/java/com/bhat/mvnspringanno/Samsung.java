package com.bhat.mvnspringanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	private Mobileprocessor mp;
	
	public void config() {
		System.out.println("config method of samsung");
		mp.process();
	}

}
