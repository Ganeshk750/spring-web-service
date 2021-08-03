package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ganesh.beans")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		/* Tight Coupling Problem */
		//TightCouplingProblem problem = new TightCouplingProblem(new Doctor(), new Engineer());
		//problem.showData();
		
		/* Tight Coupling Solution */
		//TightCouplingSolution solution = new TightCouplingSolution(new PhotoGrapher());
		//solution.showData();
		
		ApplicationContext context = SpringApplication.run(Application.class, args);
		JobType jobType = context.getBean(Doctor.class);
		jobType.doJob();
		
	}

}
