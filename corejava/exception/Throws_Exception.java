package com.corejava.exception;

public class Throws_Exception {
		/*void m1() {
		System.out.println("This is  m1 code ");
		int a=10;
		int b=0;
		
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("Can't divide zero!!!");
		} System.out.println(" m2 End!!!");
	}
	void m2() {
		System.out.println("This is  m2 code ");
		int arr[]= null;
		try {
		System.out.println(arr.length);
		}catch(NullPointerException e){
			System.out.println("Cannot read the array length because \"arr\" is null");
		} System.out.println(" m2 End!!!");
        m1();
	}
	*/
	public static void main(String args[])throws ArithmeticException {
		System.out.println("Start the main code \rcall method 2");
	 // Throws_Exception  a=new Throws_Exception();
		//a.m2();
		System.out.println("This is  m1 code ");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("ex:"+c);
		System.out.println("End!!!");
	}
}
