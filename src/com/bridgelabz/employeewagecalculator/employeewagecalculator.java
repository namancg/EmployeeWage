package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	public static void main(String[] args) {
		int PART = 1;
        int FULL = 2;
        int WagePH = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empType == FULL)
        {
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empType == PART)
        {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WagePH;
        System.out.println("Employee Daily Wage is " + wage);

	}

}
