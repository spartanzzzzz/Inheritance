package com.obsqura.inheritance.employee;

public class Salary extends HRA {
	
		
	public int totsalary() {
		int total = super.basicpay+super.hra+super.bonuspay-super.deductionamt-super.pf;
		return total;
		
	}
	public void salarySlip() {
		System.out.println("The salary slip: ");
		System.out.println("Basic Pay:"+" "+ super.basicpay);
		System.out.println("Deduction:"+" "+ super.deductionamt);
		System.out.println("Bonus:"+" "+ super.bonuspay);
		
	}
	public static void main(String[] args) {
	    Salary obj1 = new Salary();
		obj1.getDetails();
		obj1.salarySlip();
        System.out.println("House Rent Allowance:"+" " + obj1.calhra());
		System.out.println("Provident Fund:"+" "+ obj1.calpf());
		System.out.println("The total salary of the employee in hand :"+ " "+ obj1.totsalary());
		
	}

}
