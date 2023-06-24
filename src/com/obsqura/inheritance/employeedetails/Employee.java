package com.obsqura.inheritance.employeedetails;

public class Employee extends Member {
	String specialization; 
	Employee(String name,int age,int phoneNo, String address,int salary){ 
	this.name = name; 
	this.age = age; 
	this.phoneNo = phoneNo; 
	this.address = address; 
	this.salary = salary;
	} 

}
