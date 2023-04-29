package com.corejava.array;
/*Jagged array:
 * An arrays of array with different no.of columns called jagged array.
 * 
 */
public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int [3][];
		// Instatiate the jagged array.
		arr[0]=new int [1];
		arr[1]=new int [3];
		arr[2]=new int [5];
		// Initialize the jagged array.
		int count=1;
		for(int i=0;i<arr.length;i++)//no.of rows 
			for(int j=0;j<arr[i].length;j++)// no.of columns
				arr[i][j]=count++;
		//Printing the jagged array.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
	}

}
