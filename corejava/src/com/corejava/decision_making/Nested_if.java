package com.corejava.decision_making;

public class Nested_if {
	//Blood donate age >=18, and weight >50
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //Creating two variables for age and weight    
		    int age=25;    
		    int weight=55;      
		    //applying condition on age and weight    
		    if(age>=18){      
		        if(weight>50){    
		            System.out.println("You are eligible to donate blood");    
		        } else{  
		            System.out.println("You are not eligible to donate blood");    
		        }  
		    } else{  
		      System.out.println("Age must be greater than 18");  
		    }  
		}  

	}

/*Nested if:
 * The nested if statement represents the if block within another if block. 
 *      Here, the inner if block condition executes only when outer if block condition is true.
 * 
 * Syntax:
 *     if(condition){    
     //code to be executed    
          if(condition){  
             //code to be executed    
      }    
     } 
     else if{
       //code to be executed  
    }else{
   }
 */
