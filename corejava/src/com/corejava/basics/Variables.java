package com.corejava.basics;

public class Variables {
	static int b=6;// 3.static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=07; // 2.instance variable 
		int c=11; //1.Local variable
		/* 'a' --> variable name, '123' -->  variable value 
	        The variable a is store the value 123	 
		*/		     
		System.out.println("\n Display value of a:"+a);// + --> concatenate  , /n --> new line in the console.
		System.out.println("\n Display value of b:"+b);
		System.out.println("\n Display value of c:"+c);
;
	/*
	  1.Local variable: 
	     It is declare inside class and method and  access directly.
	  2.Instance variable:
	     It is declare inside the class but out side the method.
	     Accessing is done through object creation. 
	  3.static variables:
	     It is declare as static and it can't local.
	     It is declare inside the class but out side the method.
	     Memory allocated only once.  
	 */
	}

}
