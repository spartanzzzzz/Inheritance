package com.obsqura.inheritance.employeedetails;

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee("Anoob", 40, 225648,"India", 50000);
		Manager mangr = new Manager("Reshmi", 35, 224789,"India", 30000); 
		emp.printSalary(); 
		mangr.printSalary(); 
	} 

}


