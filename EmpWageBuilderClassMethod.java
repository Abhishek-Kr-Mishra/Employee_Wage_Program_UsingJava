package com.AssignmentDay19_EmployeeWage.EmployeeWage;

public class EmpWageBuilderClassMethod {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private final String company;
	private final int wagePerHour;
	private final int maxWorkingDayInMonth;
	private final int maxHourInMonth;
	private int totalWage;
	
	
	public EmpWageBuilderClassMethod(String company, int wagePerHour, int maxWorkingDayInMonth, int maxHourInMonth ) {
			super();
			this.company=company;
			this.wagePerHour=wagePerHour;
			this.maxWorkingDayInMonth=maxWorkingDayInMonth;
			this.maxHourInMonth=maxHourInMonth;
	}
	
	public void computeEmpWage()
	{
		int workHour=0,totalWorkingHours=0, totalWorkingDays=0;
		
		while(totalWorkingHours<maxHourInMonth && totalWorkingDays<maxWorkingDayInMonth) {
			
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
			System.out.println("Day= "+totalWorkingDays+"	Today's work Hour= "+workHour);
		}
		
		totalWage=totalWorkingHours*wagePerHour;
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for Company "+ company +"is: "+ totalWage ;
	}
	
}
