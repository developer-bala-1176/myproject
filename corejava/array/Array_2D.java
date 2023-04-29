package com.corejava.array;
/**Multi- dimensional array:
 * Collection of 1D arrays with same data types and it's also known as Matrix.
 * Instantiate 2D array :
 *       int arr[][]=new int[3][3];
 *Initialize:
 * arr[0][0]=1;
 * arr[0][1]=2;
 * arr[0][2]=3;
 * arr[1][0]=4;
 * arr[1][1]=5;
 * arr[1][2]=6;
 * arr[2][0]=7;
 * arr[2][1]=8;
 * arr[2][2]=9;
 * 
 */
public class Array_2D {
// different print in array
	public static void main(String[] args) {
		
		int arr[][]= {{1,2},{3,4},{5,6},{7,8}}; // value strote in 2d array. 
		/*1. Ptint all elements in the array.
	     *Output:
		 *    1
		 *    2
		 *    3
		 *    4
		 *    5
	     *	  6 
	     */
		System.out.println("~~~~~~~~~~~~~~~Elements in vertical!!!~~~~~~~~~~~~~~~");
		for(int row=0;row<arr.length;row++) { // outer loop for row. 
			for(int col=0;col<arr[0].length;col++) { // inner loop for column.
				System.out.println(arr[row][col]); //  all elements in the arr.
			}
		}
		
		System.out.println("~~~~~~~~~~~~~~~Elements in harizondal!!!~~~~~~~~~~~~~~~");
		/*1.Output
		 *    123456
		 */
		for(int row=0;row<arr.length;row++) { // outer loop for row. 
			for(int col=0;col<arr[0].length;col++) { // inner loop for column.
				System.out.print(arr[row][col]); //  all elements in the arr.
			}
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~Elements in Matrix!!!~~~~~~~~~~~~~~~~~~");
		/*1.Output
		 *    12
		 *    34
		 *    56
		 */
		for(int row=0;row<arr.length;row++) { // outer loop for row. 
			for(int col=0;col<arr[0].length;col++) { // inner loop for column.
				System.out.print(arr[row][col]); //  all elements in the arr.
			}
			System.out.println();// next line-->for one row is completed move to another row.
		}
		
		System.out.println("~~~~~~~~~~~~~~~Print 1st and last row!!!~~~~~~~~~~~~~~~~");
			for(int row=0;row<arr.length;row++) { // outer loop for row. 
			for(int col=0;col<arr[0].length;col++) {
				if(row==0||row==arr.length-1) {// inner loop for column.
				System.out.print(arr[row][col]); //  all elements in the arr.
				}
			}
		System.out.println();
		}
		
	}

}
