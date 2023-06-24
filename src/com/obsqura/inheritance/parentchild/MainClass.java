package com.obsqura.inheritance.parentchild;

public class MainClass extends Child {
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display();
        Child child = new Child();
        child.display();
        Parent child1 = new Child();
        child1.display();
	}

}
