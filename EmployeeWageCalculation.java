package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int WAGE_PER_HOUR=20;
		int workHour=8;
		int perDaySalary=0;
		
		int isPresent=1;
		Random random = new Random();
		int randomValue=random.nextInt(2);
		
		if(randomValue==isPresent) {
			perDaySalary=WAGE_PER_HOUR*workHour;
			System.out.println("Employee Is Present");
			System.out.println("Salary= "+perDaySalary);
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Salary= "+perDaySalary);
		}
	}
}