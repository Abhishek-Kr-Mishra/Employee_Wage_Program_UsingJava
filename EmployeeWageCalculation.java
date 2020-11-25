package com.AssignmentDay19_EmployeeWage.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int WAGE_PER_HOUR=20;
		int totalWorkingHours=0;
		int totalWorkingDays=0;
		int monthSalary=0;
		int workHour=0;
		int perDaySalary=0;
		
		
		while(totalWorkingHours<100 && totalWorkingDays<20) {
	
			Random random = new Random();
			int randomValue=random.nextInt(3)+1;
		
			switch(randomValue) {
			case 1:
				workHour=8;
				totalWorkingHours=totalWorkingHours+workHour;
				break;
			
			case 2:
				workHour=4;
				totalWorkingHours=totalWorkingHours+workHour;
				break;
		
			case 3:
				workHour=0;
				totalWorkingHours=totalWorkingHours+workHour;
				break;
			
			default:
				System.out.println("Invalid Case");
		}

			totalWorkingDays++;
			perDaySalary=WAGE_PER_HOUR*workHour;
			monthSalary=monthSalary+perDaySalary;
			System.out.println("Salary of Day "+ totalWorkingDays +" = "+perDaySalary);
		}
		
			System.out.println("Total Working Hour= "+totalWorkingHours);
			System.out.println("Total Slary of the Month= "+monthSalary);
		
	}
	
}