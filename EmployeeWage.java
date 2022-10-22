package com.blz.assignment.day3;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	static int monthlyWage;
	static int monthlyHrs = 100;
	static int monthlyDays = 20;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program");
		int EmpWagePerHr = 20;
		int fullWorkingHr = 8;
		int partTimeWage = 10;
		int partWorkingHr = 4;
		int fullWage;
		int partTimeWage1;

		Random random = new Random();
		int randomNum = random.nextInt(3);
		switch (randomNum) {
		case 0:
		System.out.println("Employee is absent");
		break;
		case 1:
		System.out.println("Employee is present");
		fullWage = EmpWagePerHr * fullWorkingHr;
		System.out.println("The Daily Employee Wage for full time Employee is  " + fullWage + "$");
		System.out.println("Calculating Wage for a month");
		monthlyWage = monthlyDays * EmpWagePerHr * fullWorkingHr;
		System.out.println("The monthly wage of a full time employee is  " + monthlyWage + "$");
		break;
		
		case 2:
		System.out.println("Employee is partime present");
		partTimeWage1 = partTimeWage * partWorkingHr;
		System.out.println("The Daily Wage for the Part Time Employee is  " + partTimeWage1 + "$");
		break;
		}
	}
}
