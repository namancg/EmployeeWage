package com.bridgelabz.employeewagecalculator;

public class EmployeeWageBuilderArray {

	public static final int PART_TIME =1;
	public static final int FULL_TIME=2;
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];	
	}
	private void computeEmpWage() {
		for (int i= 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].settotal_EmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
				totalWorkingDays < companyEmpWage.NUM_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+ totalWorkingDays +" Emp Hr: "+empHrs);
		}
		return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
	}
	private void addCompanyEmpWage(String company, int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EMP_RATE_PER_HOUR,NUM_WORKING_DAYS, maxHoursPerMonth);
		numOfCompany++;
	}

	public static void main(String[] args) {
		EmployeeWageBuilderArray empWageBuilder = new EmployeeWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("WALLMART", 18, 2, 12);
		empWageBuilder.addCompanyEmpWage("TATA", 20, 4, 17);
		empWageBuilder.computeEmpWage();
	}	
}
