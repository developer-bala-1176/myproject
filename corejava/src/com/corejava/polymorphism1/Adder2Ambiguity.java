package com.corejava.polymorphism1;
//By changing the return type only.
public class Adder2Ambiguity {
	//Two argument
	public static int add(int a, int b){
		 return a+b; 
	 }
	// same methood name but return double
	public static double add(int a, int b, int c){
		 return a+b+c; 
}
}
