package com.AssignmentDay19_EmployeeWage.EmployeeWage;

public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	
}
