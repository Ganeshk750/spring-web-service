package com.ganesh;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredExample {

	@Autowired
	JobType jobType;

	public void showData() {
		jobType.doJob();
	}
}
