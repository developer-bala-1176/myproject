package com.corejava.loop;

public class Nested_ForLoop {
/*
 * Nested for:
 *      If we have a for loop inside the another loop, it is known as nested for loop. 
 *      The inner loop executes completely whenever outer loop executes.
 *      
 */   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) { 
			for(int j=1;j<=3;j++) { 
				System.out.println(i+" "+j);
			}
		}

	}

}
