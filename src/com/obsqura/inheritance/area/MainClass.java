package com.obsqura.inheritance.area;

public class MainClass {
	public static void main(String[] args) {        
		Rectangle r = new Rectangle (10,20);        
		Square s = new Square (10);        
		r.print_area();        
		r.print_perimeter();        
		s.print_area();       
		s.print_perimeter();    
		}
}

	