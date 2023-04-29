package com.corejava.keywords;
/* return:
 *   The return keyword finished the execution of a method, and can be used to return a value from a method.
 * 
 */
public class Return {
	static int myMethod(int x) {
	    return 5 + x;// 5+3=8
	  }

	  public static void main(String[] args) {
	    System.out.println(myMethod(3));// pass value to MyMethod(int X}--> x=3
	  }
	}

