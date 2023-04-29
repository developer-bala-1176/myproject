package com.corejava.array;
public class Array_1D {
/*
 * Single dimensional array:
 *      list of same data type values store in a sequence is called single dimensional array.
 *      it mention in single square brakets--> []
 */
	public static void main(String[] args) {		
		int a[]= {12,23,35,35,20};    // Declare and initialling the array 
		int count =0; //Count the total array element length. 
		System.out.println("Index base print a[3]:"+a[3]); // Print the 3 index value.
		for(int i=0;i<a.length;i++) {
			count++; // increase the count.
			System.out.println(a[i]);// Print array value.
		}
		System.out.println("Total count of array :"+(count));//  Print the size of all array element..
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Array_1D arr=new Array_1D ();
		arr.printForEach();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		arr.passingArrayMethod(a);
		System.out.println("~~~~~~~~~~~~~~~~Anonymous Array~~~~~~~~~~~~~~~~");
		printArray(new int[]{12,21,21,21,32,44});
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		arr.outBoundEx();	
	}

	private static void printArray(int[] is) {
		for(int i:is)
			System.out.println(i);// Print array value.
		
	}

	private void passingArrayMethod(int[] b) {
		int min=b[0];
		for(int i=1;i<b.length;i++) {
			 if(min>b[i])  {
				  min=b[i]; 
				  }
			 
		}	  
		System.out.println("minimum:"+min); 
	}

	private void printForEach() {
		int a[]= {10,20,12,14,45};
		for(int i:a)
			System.out.println(i);// Print array value.
	}

	private void outBoundEx() {
		int a[]= {10,20,12,14,45};
		for(int i=0;i<=a.length;i++) { // 0,1,2,3,4,-->5 so ArrayIndexOutOfBoundsException
			System.out.println(a[i]);// Print array value.
		}
		
	}
	
	
}
	


