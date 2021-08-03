package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.beans.PhotoGrapher;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		/* Tight Coupling Problem */
		//TightCouplingProblem problem = new TightCouplingProblem(new Doctor(), new Engineer());
		//problem.showData();
		
		/* Tight Coupling Solution */
		TightCouplingSolution solution = new TightCouplingSolution(new PhotoGrapher());
		solution.showData();
	}

}
