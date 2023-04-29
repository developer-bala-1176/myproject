package com.corejava.aggregation;

public class Circle {
	Operation op ;// Aggregation ---> syntax-class_name refrenceVariable.
	double pi=3.14;
	
	public double area(int radius) {
	    op =new Operation () ;
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
	public static void main(String[] args) {
		//Create a object to Circle.
		Circle c=new Circle();
		//Pass value.
	    double result=c.area(5);
	    System.out.println(result);
	}

}
