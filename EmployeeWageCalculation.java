package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int WAGE_PER_HOUR=20;
		int workHour=0;
		int perDaySalary=0;
		
		Random random = new Random();
		int randomValue=random.nextInt(3)+1;
		
		switch(randomValue) {
		case 1:
			System.out.println("Employee is Full Time");
			workHour=8;
			break;
			
		case 2:
			System.out.println("Employee is Part Time");
			workHour=4;
			break;
		
		case 3:
			System.out.println("Employee is absent");
			break;
			
		default:
			System.out.println("Invalid Case");
		}

		perDaySalary=WAGE_PER_HOUR*workHour;
		System.out.println("Salary= "+perDaySalary);
		
	}
}