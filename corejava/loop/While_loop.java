package com.corejava.loop;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter limit:");
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(); //3
      int i=1;
      while (i<=n) {  // 1<=3 2<=3 3<=3 (4<=3 ...false).
    	  
    	  System.out.println(i);//1 2 3
    	     		 i++;  //i=i+1 1+1=2 2+1=3 3+1=4
    	 
      }
	}

}
/*
 *While loop:
 *   The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. 
       As soon as the Boolean condition becomes false, the loop automatically stops.
 *   The while loop is considered as a repeating if statement. 
 *     If the number of iteration is not fixed, it is recommended to use the while loop
 *Syntax:

     while (condition){    
       //code to be executed   
     Increment / decrement statement  
  }    
*/
