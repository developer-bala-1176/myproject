package com.corejava.array;
// Copy of one array to another.
public class CopyOfArrays {

	public static void main(String[] args) {
		//Declare source of array 
		char copyFrom[]= {'B','A','L','A','S','U','B','R','A','M','A','N','I','A' ,'N' };
	    //Declaring detination array
		char copyTo[]=new char[11];
		// copying array using System.arraycopy();-->method
			System.arraycopy(copyFrom, 4, copyTo, 0, 11);
	    //Prin detinasation array
			System.out.println(String.valueOf(copyTo));
	}

}
