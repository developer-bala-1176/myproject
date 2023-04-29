package com.corejava.operators;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=10,b=5,c=25; // assign a values 
	     // logical AND
	      System.out.println("\nLocigal AND!!");
	      System.out.println(a<b&&b<c); // (10<5&&5>25)  (F&&T)   F
	      System.out.println(a>b&&b<c); // (10>5&&5<25)  (T&&T)   T
	      System.out.println(a<b&&b<c); // (10<5&&5<25)  (F&&T)   F
	     //Logical OR
	      System.out.println("\nLocigal OR!!");
	      System.out.println(a>b||c<b); // (10>5||25<5)    (T&&F)   T
	      System.out.println(c>a||a<c); // (25>10||10<25)  (T&&T)   T
	      System.out.println(a<b||c<b); // (10<5||25<5)    (F&&F)   F
	      System.out.println("\nLogical NOT!!");
	      System.out.println(!(a<b||c<b));// !(F) T
	/* LOGICAL AND 
	 * The logical && operator doesn't check the second condition if the first condition is false. 
	 * It checks the second condition only if the first one is true.
	 *	 T		  F			F 
	 *	 F        T			F
	 *	 T        T 		T
	 * 	 F		  F			F
	 * LOCICAL OR
	 * The logical || operator doesn't check the second condition if the first condition is true.
	 *  It checks the second condition only if the first one is false.

	 *   T		  F			T
	 *	 F        T			T
	 *	 T        T 		T
	 * 	 F		  F			F
	 * Logical NOT
	 *   T			F
	 *   F			T
	 */
	}

}
