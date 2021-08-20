package com.bridgelabz.employeewagecalculator;

public class employeewagecalculator {

	public static void main(String[] args) {
		final int PART = 1;
        final int FULL = 2;
        int WagePH = 30;
        int WORKING_DAYS = 20;
   
       int totalWage = 0;
       for (int day = 1; day<= WORKING_DAYS; day++)
       {
           int emp = (int) (Math.random() * 100) % 3;
           int workingHours =0;
           switch (emp)
           {
               case FULL:
                   workingHours = 8;
                   break;
               case PART:
                   workingHours = 4;
                   break;
               default:
           }
           int wage = workingHours * WagePH;
           System.out.println("Day " + day + " wage is=" + wage);
           totalWage += wage;
       }
       System.out.println("Total wage for a month is =" + totalWage);  

	}

}
