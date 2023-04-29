package com.corejava.decision_making;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		short age=sc.nextShort();
		if(age==18) {
			System.out.println("You are eligible for vote!");
		}else {
			System.out.println("you wait for:"+(18-age));
			System.out.println("Sorry!!! yor are not eligible for vote!");
		   
		}

	}

}
/*
 * If else :
 *  It executes the if block if condition is true otherwise else block is executed.
 *  
 *  syntax:
 *  
     if(condition){  
        //code if condition is true  
     }else{  
        //code if condition is false  
}  
*/