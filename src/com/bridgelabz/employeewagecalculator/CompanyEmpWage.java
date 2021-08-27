package com.bridgelabz.employeewagecalculator;

public class CompanyEmpWage {
	public final String company;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_WORKING_DAYS;
	public final int maxHoursPerMonth;
	public int total_EmpWage;
	public void settotal_EmpWage(int total_EmpWage) {
		this.total_EmpWage = total_EmpWage;
	}
	public CompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS, int maxHoursPerMonth) {
		this.company= company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	@Override
	public String toString() {
		return "Emp Wage for Company: "+company+" is: "+total_EmpWage;
	}
}
