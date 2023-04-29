package com.corejava.object;

public class TestRectangle {
	// Area of rectangle using method and multiple object by one
	public static void main(String[] args) {
		//multiple object by one
		Rectangle r1=new Rectangle(),r2=new Rectangle();
		// Intialize value 
		r1.Insert(10, 023);
		r2.Insert(23, 20);
		//Print the value
		r1.Area();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
        r2.Area();
	}

}
