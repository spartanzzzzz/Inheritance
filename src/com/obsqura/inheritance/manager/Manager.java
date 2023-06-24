package com.obsqura.inheritance.manager;

public class Manager extends Employee {
	public void managerDetails() {
		System.out.println("Salary and Bonus details of Manager is:");
		System.out.println(super.calculateSalary(empsal));
		System.out.println();
		System.out.println(super.calculateBonus(bonus));
	}
	

}
