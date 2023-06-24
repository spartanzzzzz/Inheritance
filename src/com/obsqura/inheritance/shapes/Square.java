package com.obsqura.inheritance.shapes;

public class Square extends Rectangle {
	
		public void print() {
			super.print();
			System.out.println("Square is a rectangle");
		}

	public static void main(String[] args) {
		Square square = new Square();
		square.print();
		

	}

}
