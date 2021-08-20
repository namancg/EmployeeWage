package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	public static void main(String[] args) {
		int FULL = 1;
        int emp = (int) (Math.random() * 100) % 2;
        if (emp == FULL)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }

	}

}
