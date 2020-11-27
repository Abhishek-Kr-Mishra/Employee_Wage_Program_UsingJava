package com.AssignmentDay19_EmployeeWage.EmployeeWage;


public class EmployeeWageCalculation {

	
	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");
		
		EmpWageBuilderClassMethod DMart = new EmpWageBuilderClassMethod("D-Mart",20,10,80);
		EmpWageBuilderClassMethod BigBazar = new EmpWageBuilderClassMethod("Big Bazar",25,20,100);
		
		System.out.println("D-Mart");
		DMart.computeEmpWage();
		
		System.out.println("Big Bazar");
		BigBazar.computeEmpWage();
		
		
	}
		
}