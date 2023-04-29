package com.corejava.decision_making;

import java.util.Scanner;

public class SwitchCase {
/*
 * ABC Bank provide the bonus based on your Account balance.
 *    Above 500000-10000
 *    Above 250000-5000
 *    Above 200000-2500
 *    Above 100000-1250
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("ABC Bank provide the bonus based on your Account balance.");
     System.out.println(" ABC Bank Account balance:");
     System.out.println("\t1.Above 500000");
     System.out.println("\t2.Above 250000");
     System.out.println("\t3.Above 200000");
     System.out.println("\t4.Above 100000");
     System.out.println("choose your income:");
     Scanner in =new Scanner(System.in);
     short ch=in.nextShort();
     switch(ch) {
     case 1:
    	   System.out.println("Account balance with bonus:"+(500000+10000));
    	   break;
     case 2:
    	 System.out.println("Account balance with bonus:"+(250000+5000));
    	 break;
     case 3:
    	 System.out.println("Account balance with bonus:"+(200000+2500));
    	 break;
     case 4:
    	 System.out.println("Account balance with bonus:"+(100000+1250));
    	 break;
    default:
          System.out.println("Invalid selection!!!");
          break;
     }
	}

}
/* Switch statement:
 *   The Java switch statement executes one statement from multiple conditions. 
 *   It is like if-else-if ladder statement. 
 * Syntax:

 switch(expression){    
   case value1:    
     //code to be executed;    
    break;  //optional  
   case value2:    
      //code to be executed;    
    break;  //optional  
     ......    
    
  default:     
     code to be executed if all cases are not matched;  
  }    
 */
