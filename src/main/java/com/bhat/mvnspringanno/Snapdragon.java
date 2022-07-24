package com.bhat.mvnspringanno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Mobileprocessor {

	public void process() {
		System.out.println("snapdragon processor");
	}

}
