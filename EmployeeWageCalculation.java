package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int WAGE_PER_HOUR=20;
		int DAYS_IN_A_MONTH=20;
		int monthSalary=0;
		int workHour=0;
		int perDaySalary=0;
		
		
		for(int i=1; i<=DAYS_IN_A_MONTH; i++) {
	
			Random random = new Random();
			int randomValue=random.nextInt(3)+1;
		
			switch(randomValue) {
			case 1:
				workHour=8;
				break;
			
			case 2:
				workHour=4;
				break;
		
			case 3:
				workHour=0;
				break;
			
			default:
				System.out.println("Invalid Case");
		}

			perDaySalary=WAGE_PER_HOUR*workHour;
			monthSalary=monthSalary+perDaySalary;
			System.out.println("Salary of Day "+ i +" = "+perDaySalary);
	}
		
		System.out.println("Total Salary of the month ="+monthSalary);
	}
}