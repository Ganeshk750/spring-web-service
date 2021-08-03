package com.ganesh;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements JobType {

	@Override
	public void doJob() {
		System.out.println("I am a doctor");
	}
	

}
