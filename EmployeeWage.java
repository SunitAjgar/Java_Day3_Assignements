package com.blz.assignment.day3;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
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
        System.out.println("The Daily Employee Wage for full time Employee is  "+fullWage +"$");
        break;
		}
	}
}
