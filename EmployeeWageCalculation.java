package com.AssignmentDay19_EmployeeWage.EmployeeWage;


class EmpWageBuilderClassMethod {
	
	public static final int WAGE_PER_HOUR=20;
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int MAX_HOURS_IN_A_MONTH=100;
	public static final int NUM_OF_WORKING_DAY_IN_A_MONTH=20;
	
	public static int computeEmpWage()
	{
		int workHour=0,totalWorkingHours=0, totalWorkingDays=0, perDaySalary=0, monthSalary=0;
		
		while(totalWorkingHours<MAX_HOURS_IN_A_MONTH && totalWorkingDays<NUM_OF_WORKING_DAY_IN_A_MONTH) {
			
			int employeeAttendance= (int) Math.floor(Math.random() * 10)%3;
		
			switch(employeeAttendance) {
			case IS_FULL_TIME:
				workHour=8;
				totalWorkingHours=totalWorkingHours+workHour;
				break;
			
			case IS_PART_TIME:
				workHour=4;
				totalWorkingHours=totalWorkingHours+workHour;
				break;
			
			default:
				workHour=0;
			}

			totalWorkingDays++;
			perDaySalary=WAGE_PER_HOUR*workHour;
			monthSalary=monthSalary+perDaySalary;
			System.out.println("Day= "+totalWorkingDays+"	Today's Salary= "+perDaySalary);
		}
		return monthSalary;
	}
	
}


public class EmployeeWageCalculation {

	
	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		int totalSlary= EmpWageBuilderClassMethodTrial.computeEmpWage();
		System.out.println("Total Salary is: "+totalSlary);
		
	}
		
}