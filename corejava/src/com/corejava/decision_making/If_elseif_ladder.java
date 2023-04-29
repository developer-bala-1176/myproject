package com.corejava.decision_making;

import java.util.Scanner;

public class If_elseif_ladder {
	 /*
	  * Super market announce the special offers for customer.
	  *      (Based on the customer purchase in the market) 
	  *  1)Total purchase more then 10000 - 999 cash less in total price.
	  *  2)Total purchase more then 5000 - 499 cash less in total price
	  *  3)Total total purchase more then 2500 - 249 cash less in total price
	  *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10000,b=5000,c=2500;
		System.out.println("Welcome to special offer zone!");
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your total purchase amount:");
       double t_purchase=sc.nextDouble();
       if(t_purchase>=a ) {
    	   System.out.println("Your Old bill amount:"+ t_purchase);
    	   System.out.println("your new bill amount:"+(t_purchase-999)+ " --> you save 999");
       }else if((t_purchase<a) && (t_purchase>=b)){
    	   System.out.println("Your Old bill amount:"+ t_purchase);
    	   System.out.println("your new bill amount:"+(t_purchase-499)+" --> you save 499");
       }else if((t_purchase<b) && (t_purchase>=c)){
    	   System.out.println("Your Old bill amount:"+ t_purchase);
    	   System.out.println("your new bill amount:"+(t_purchase-249)+" --> you save 249");
       }else {
    	   System.out.println("Sorry!!! you are not eligible for today's offer!");
    	   System.out.println("your bill amount:"+ t_purchase);
       }
       System.out.println("      Thank you!!!     Visit Again!!!");
       
		
	}

}
/*
 * if else if ladder:
 *   Executes one condition from multiple statements.
 *syntax:
 *  if(condition1){  
         //code to be executed if condition1 is true  
    }else if(condition2){  
         //code to be executed if condition2 is true  
    }   
	else if(condition3){  
	    //code to be executed if condition3 is true  
	}  
		...  
	else{  
		//code to be executed if all the conditions are false  
  }  
 */
