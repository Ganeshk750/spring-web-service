package com.ganesh.beans;

import org.springframework.stereotype.Component;

import com.ganesh.JobType;

@Component
public class PhotoGrapher implements JobType {

	@Override
	public void doJob() {
		System.out.println("I am a Photographer");
	}

}
