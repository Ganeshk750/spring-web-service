package com.ganesh.beans;

import org.springframework.stereotype.Component;

import com.ganesh.JobType;

@Component
public class Doctor implements JobType {

	@Override
	public void doJob() {
		System.out.println("I am a doctor");
	}
	

}
