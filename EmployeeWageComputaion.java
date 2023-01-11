package com.bridzelabz.employeeWage;

public class EmployeeWageComputaion {
	final int IS_FULL_TIME=2;
	final int IS_PART_TIME=1;
	int NUM_OF_WORKING_DAYS=5;
	int MAX_HRS_IN_MONTH=15;
	int totalWorkingDays=0;
	int EMP_RATE_PER_HOUR=20;
	int empHrs=0;
	int empWage=0;
	int totalEmpHrs=0;
public void wagesTillaCondition() {

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

}
