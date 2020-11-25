package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int isPresent=1;
		Random random = new Random();
		int randomValue=random.nextInt(2);
		
		if(randomValue==isPresent) {
			System.out.println("Employee Is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

}
