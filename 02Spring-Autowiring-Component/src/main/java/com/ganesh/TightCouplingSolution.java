package com.ganesh;

public class TightCouplingSolution {
	
	JobType jobType;
	
	public TightCouplingSolution(JobType jobType) {
		this.jobType = jobType;
	}
	
	public void showData() {
		jobType.doJob();
	}

}
