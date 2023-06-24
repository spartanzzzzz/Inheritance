package com.obsqura.inheritance.employee;
import java.util.Scanner;

public class BasicPay {
	int basicpay,deductionamt,bonuspay;
	Scanner pay = new Scanner(System.in);
	public void getDetails(){ 
		System.out.println("Enter the basic pay:");
		basicpay = pay.nextInt();
		System.out.println("Enter the deduction amount:");
		deductionamt = pay.nextInt();
		System.out.println("Enter the bonus:");
		bonuspay = pay.nextInt();
		
	}
	
}
