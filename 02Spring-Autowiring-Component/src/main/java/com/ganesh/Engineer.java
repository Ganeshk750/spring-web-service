package com.ganesh;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements JobType{

	@Override
	public void doJob() {
		System.out.println("I am an Engineer");
	}

}
