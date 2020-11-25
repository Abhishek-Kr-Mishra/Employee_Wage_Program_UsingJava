package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int WAGE_PER_HOUR=20;
		int workHour=0;
		int perDaySalary=0;
		int isPresent=1;
		int isFullTime=1;
		
		Random random = new Random();
		int randomValue=random.nextInt(2);
		
		if(randomValue==isPresent) {
			int fullOrPart=random.nextInt(2);
			if(fullOrPart==isFullTime) {
				System.out.println("Employee is Present and Full Time ");
				workHour=8;
			}
			else {
				System.out.println("Employee is Present and Part Time");
				workHour=4;
			}
		}
		else {
			System.out.println("Employee is Absent");
		}
		
		perDaySalary=WAGE_PER_HOUR*workHour;
		System.out.println("Salary= "+perDaySalary);
		
	}
}