package com.corejava.loop;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		 do{
			System.out.println("Value of i:"+i);
			i++;
			if(i==95) {
				System.out.println("End value of i:"+i);
				 
			}
		}while(i<=100);

	}
	/*
	 * Do While :
	 *   1)Java do-while loop is called an exit control loop.
	 *      Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body.
	 *      The Java do-while loop is executed at least once because condition is checked after loop body.
	 *    
	 *    Syntax:
            do{    
             //code to be executed / loop body  
             //update statement   
             }while (condition);    
	 *     
	 */

}
