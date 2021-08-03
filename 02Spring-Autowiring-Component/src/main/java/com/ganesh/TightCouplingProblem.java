package com.ganesh;

import com.ganesh.beans.Doctor;
import com.ganesh.beans.Engineer;

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
