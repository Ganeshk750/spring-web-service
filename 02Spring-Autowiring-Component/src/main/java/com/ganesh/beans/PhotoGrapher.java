package com.ganesh.beans;

import com.ganesh.JobType;

public class PhotoGrapher implements JobType {

	@Override
	public void doJob() {
		System.out.println("I am a Photographer");
	}

}
