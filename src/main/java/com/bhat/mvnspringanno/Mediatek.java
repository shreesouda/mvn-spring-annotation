package com.bhat.mvnspringanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediatek implements Mobileprocessor {

	public void process() {
		System.out.println("mediatek processor");
	}

}
