package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	
	private static final int PART_TIME=2;
	private static final int FULL_TIME=1;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int NUM_WORKING_DAYS = 20;
	private static final int MAX_WORK_HRS = 100;
	private static String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursInMonth ;
	public int total_empWage;
	
	employeewagecalculator (String company, int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS, int MAX_WORK_HRS){
		this.company = company;
		this.empRatePerHour = EMP_RATE_PER_HOUR;
		this.numOfWorkingDays = NUM_WORKING_DAYS;
		this.maxHoursInMonth = MAX_WORK_HRS;
	}
	
	public void computeEmployeeWage() {
		
		int empHrs = 0;
		int total_empHrs = 0;
		int total_workingDays = 0;
		
		while(total_empHrs <= MAX_WORK_HRS && total_workingDays < NUM_WORKING_DAYS) {
			
			total_workingDays++;
			int attendance = (int) Math.floor(Math.random()*10) %3;
			
			switch(attendance) {
			
			case FULL_TIME:
				empHrs = 8;
				break;
				
			case PART_TIME:
				empHrs = 4;
				break;
				
			default:
				empHrs = 0;
			
			}
			
			total_empHrs += empHrs;
			System.out.println("Day"+total_workingDays+": Emp Hrs = "+empHrs);
		}
		
		total_empWage = total_empHrs * EMP_RATE_PER_HOUR;
		//System.out.println("Total Employee Wage : "+total_empWage);
	
	}
	@Override
	public String toString()
	{
		return "TOTAL"+company+":"+total_empWage;
	}
	public static void main(String args[])
	{
		
		employeewagecalculator wallMart = new employeewagecalculator("WALLMART",16, 7, 45);
		wallMart.computeEmployeeWage();
		System.out.println(wallMart);
		employeewagecalculator tata = new employeewagecalculator("TATA",18, 8, 55);
		tata.computeEmployeeWage();
		
		System.out.println(tata);
	}
	
}
