package com.ganesh.beans;

import com.ganesh.JobType;

public class Engineer implements JobType{

	@Override
	public void doJob() {
		System.out.println("I am an Engineer");
	}

}
