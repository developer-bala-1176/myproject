package com.corejava.polymorphism1;

public class TypePromoting {
	public static void add(int a, long b){
		System.out.println(a+b);
	 }
	// same methood name three argument
	public static int add(int a, int b, int c){
		 return a+b+c; 
	}
	public static void main(String[] args) {
		TypePromoting.add(12, 12);// second literal wil promote long
		System.out.println(TypePromoting.add(12, 12,12));// second method int return type

	}

}
