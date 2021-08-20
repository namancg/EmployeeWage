package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	public static void main(String[] args) {
		final int FULL = 1;
        final int WagePH = 30;
        int emp = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (emp == FULL)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WagePH;
        System.out.println("Employee Daily Wage is " + wage);

	}

}
