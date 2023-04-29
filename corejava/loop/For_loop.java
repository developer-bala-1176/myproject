package com.corejava.loop;

import java.util.Scanner;

public class For_loop {
	/*
	 * For loop:
	 *    initialize the variable, check condition and increment/decrement value.
	 *   Syntax:
	 *      for(initialization; condition; increment/decrement){    
            //statement or code to be executed    
            }    
	 */
	
    public static void main(String args[]) {
    	System.out.print
    	("Enter the limit:");
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	for(int i=0;i<=n;i++) {
    		System.out.println(i);
    	}
        }    

    }
