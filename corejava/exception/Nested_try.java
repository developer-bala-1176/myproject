package com.corejava.exception;

public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
			    try{    
			     System.out.println("Divide by 0");    
			     int b =39/0;    
			     }catch(ArithmeticException e) {  
			      System.out.println(e);  
			      }    System.out.println("Continue code!!");   
			    try{    
			      int a[]=new int[5];   
			     a[5]=4;    
			     }catch(ArrayIndexOutOfBoundsException e) { 
			     System.out.println(e);  
			    }   
			    System.out.println("Continue code!!");    
			    }catch(Exception e) { 
			    System.out.println("handled the exception-outer catch");  
			    }   
			   System.out.println("End!");    

	}

}
