package com.corejava.keywords;

public class Break {
/*break; --> stop the execution of a loop
	     --> based on some condion.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		for(int i=0;i<100;i++) {
			System.out.println(i);
			if(i==50) {
				System.out.println("End loop:"+i);
				break;
			}
		}
	}

}
