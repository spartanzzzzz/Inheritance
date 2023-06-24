package com.obsqura.inheritance.employee;

public class HRA extends BasicPay{
	int hra,pf;
	
		
	public int calhra() {
		hra = ((super.basicpay)*5)/100;
		return hra;
	}
	
	
	public int calpf() {
		pf = ((super.basicpay)*20)/100;
		return pf;
	}
		    
	}
		

