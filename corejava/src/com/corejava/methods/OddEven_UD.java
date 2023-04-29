package com.corejava.methods;

import java.util.Scanner;

public class OddEven_UD {
	/** User define methods:
	  *       The method written by the user or programmer is known as a user-defined method. 
	    These methods are modified according to the requirement.
	  */
	public static void main(String[] args) {
		// Creste a Scanner class object
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		// read the value from user
		int n1=in.nextInt();
		//n1 value invoke the findOddEven(user define method).
		findOddEven(n1);
		
	}
		public static void findOddEven(int n) {
			// method body
			if(n%2==0){
	               System.out.println(n+" is Even number");			
			}else {
				System.out.println(n+" is Odd number");
			}
	

	}

}
