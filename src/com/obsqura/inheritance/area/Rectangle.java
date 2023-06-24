package com.obsqura.inheritance.area;

public class Rectangle {
	int length,breadth;    
	public Rectangle(int length, int breadth){       
	this.length = length;        
	this.breadth = breadth;   
	}  
	
	public void print_area(){        
	System.out.println(length*breadth);    
	} 
	
	public void print_perimeter(){        
	System.out.println(2*(length+breadth));    
	}
}