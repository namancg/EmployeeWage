package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	public static void main(String[] args) {
		final int PART = 1;
        final int FULL = 2;
        int WagePH = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        switch (empType)
        {
            case FULL:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case PART:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");    
        }
        int wage = workingHours * WagePH;
        System.out.println("Employee Daily Wage is " + wage);

	}

}
