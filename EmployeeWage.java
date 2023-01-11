package com.bridzelabz.employeeWage;

public class EmployeeWage {
	int EMP_RATE_PER_HOUR=20;
	int empHrs=0;
	int empWage=0;
	int totalEmpHrs=0;
	
	public void employeePresentOrAbsent() {
	int IS_FULL_TIME=1;
	double empCheck=Math.floor(Math.random()*10) % 2;
	if(empCheck == IS_FULL_TIME)
			{
		System.out.println("Employee is present");
			}else
			{
				System.out.println("Employee is absent");
			}
	}
	
	public void employeeWage() {
	int IS_FULL_TIME=1;
	double empCheck=Math.floor(Math.random()*10) % 2;
	if(empCheck == IS_FULL_TIME)
	{
        empHrs=8;

	}else
	{
		empHrs=0;
	}
	empWage=empHrs* EMP_RATE_PER_HOUR;
	System.out.println("EmpWage: "+ empWage);
	}
	
	public void partTimeEmployeeWage() {
	int IS_FULL_TIME=2;
	int IS_PART_TIME=1;
	double empCheck=Math.floor(Math.random()*10) % 3;
	if(empCheck == IS_FULL_TIME)
	{
        empHrs=8;

	}else if(empCheck == IS_PART_TIME)
	{
		empHrs=4;
	}
	else {
		empHrs=0;
	}
	empWage=empHrs* EMP_RATE_PER_HOUR;
	System.out.println("EmpWage: "+ empWage);
	}
	
	public void usingSwitchCase() {
		final int IS_FULL_TIME=2;
		final int IS_PART_TIME=1;
		int empCheck=(int) (Math.floor(Math.random()*10) % 3);
		switch (empCheck) {
		case IS_FULL_TIME:
	        empHrs=8;
	        break;
		case IS_PART_TIME:   
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
		empWage=empHrs* EMP_RATE_PER_HOUR;
		System.out.println("EmpWage: "+ empWage);
	}
	
	public void wagesOfMonth() {
	final int IS_FULL_TIME=2;
	final int IS_PART_TIME=1;
	int NUM_OF_WORKING_DAYS=4;
	int totalEmpWage=0;
	for(int day =0;day<NUM_OF_WORKING_DAYS;day++) {
	int empCheck=(int) (Math.floor(Math.random()*10) % 3);
	switch (empCheck) {
	case IS_FULL_TIME:
        empHrs=8;
        break;
	case IS_PART_TIME:   
		empHrs=4;
		break;
	default:
		empHrs=0;
	}
	empWage=empHrs* EMP_RATE_PER_HOUR;
	totalEmpWage += empWage;
	System.out.println("EmpWage: "+ empWage);
	}
	System.out.println("Total EmpWage: "+ totalEmpWage);
	}
	
	public void wagesTillaCondition() {
		final int IS_FULL_TIME=2;
		final int IS_PART_TIME=1;
		int NUM_OF_WORKING_DAYS=5;
		int MAX_HRS_IN_MONTH=15;
		int totalWorkingDays=0;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
		int empCheck=(int) (Math.floor(Math.random()*10) % 3);
		switch (empCheck) {
		case IS_FULL_TIME:
	        empHrs=8;
	        break;
		case IS_PART_TIME:   
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
		totalEmpHrs += empHrs;
		System.out.println("days: "+ totalWorkingDays + "Emp Hr:" +empHrs);
		}
	

	}
	public static void main(String[] args) {
		
		EmployeeWage emp =new EmployeeWage();
        emp.employeePresentOrAbsent();
        emp.employeeWage();
        emp.usingSwitchCase();
        emp.wagesOfMonth();
        emp.wagesTillaCondition();
	}

}
