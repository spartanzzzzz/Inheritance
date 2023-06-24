package com.obsqura.inheritance.manager;
import java.util.Scanner;
public class Employee {
	double basic,da,hra,empsal,bonus;
	Scanner em = new Scanner(System.in);
	public void getDetails() {
		
		basic = em.nextDouble();
		da = em.nextDouble();
		hra = em.nextDouble();
		
	}
	public double calculateSalary(double empsal) {
		System.out.println("Total salary:");
		empsal = basic+da+hra;
		return empsal;
	}
	public double calculateBonus(double bonus) {
		System.out.println("Bonus amount:");
		bonus = 0.1*basic;
		return bonus;
	}


}