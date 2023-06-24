package com.obsqura.inheritance.manager;

public class MainClass extends Accountant {
	public static void main(String[] args) {
		MainClass employee = new MainClass();
		System.out.println("Enter the basic pay,DA and HRA of Manager:");
		employee.getDetails();
		employee.managerDetails();
		System.out.println("Enter the basic pay,DA and HRA of Accountant:");
		employee.getDetails();
		employee.accountantDetails();
		
		
		
	}

}
