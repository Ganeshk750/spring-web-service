package com.ganesh;

public class TightCouplingProblem {
	
	Doctor doctor;
	Engineer engineer;
	
	public TightCouplingProblem(Doctor doctor, Engineer engineer) {
		this.doctor = doctor;
		this.engineer = engineer;
	}
	
	public void showData() {
		doctor.doJob();
		engineer.doJob();
	}
	
    
	

}
