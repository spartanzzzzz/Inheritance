package com.obsqura.inheritance.manager;

public class Accountant extends Manager {
	public void accountantDetails() {
		System.out.println("Salary and Bonus details of Accountant is:");
		System.out.println(super.calculateSalary(empsal));
		System.out.println();
		System.out.println(super.calculateBonus(bonus));
	}
	

}
