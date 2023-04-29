package com.corejava.methods;

public class TestDemo_Ab extends Demo_Ab {

	public static void main(String[] args) {
		// Create object for aabstract class
		TestDemo_Ab d=new TestDemo_Ab();
		// Invoke abstract method 
		d.show();

	}
	// method implement (Abstract method). 
	void show() {
		System.out.println("Abstract method !!!");
		
	}

}
