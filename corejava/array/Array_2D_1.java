package com.corejava.array;

public class Array_2D_1 {
	static int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_2D_1  arr=new Array_2D_1 ();
		arr.a1();
		arr.a2();
		arr.a3();
		arr.a4();
		arr.a5();
		arr.a6();
		arr.a7();		
		
	}
	void a1(){
		System.out.println("\n~~~~~Print the boder element of squre!!!~~~~~");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if((r==0||r==arr1.length-1) ||(c==0||c==arr1[0].length-1)) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	}
	void a2() {
		System.out.println("\n~~~~~~Print the digonal element of squre!!!~~~~~");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if((r==c||r+c==arr1.length-1)) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	
	}
	void a3(){
		System.out.println("\n~~~~~Print below the major digonal element of squre!!!~~~~~");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if(r>=c) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	}
	void a4() {
		System.out.println("\nPrint below the major digonal element of squre!!!");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if(r>=c) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	}
	void a5(){
		System.out.println("\nPrint below the minor digonal element of squre!!!");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if(r<=c) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	}
	void a6() {
		System.out.println("\n~~~~~Print below the Even element of squre!!!~~~~~");
		for(int r=0;r<arr1.length;r++) { // outer loop for row. 
			for(int c=0;c<arr1[0].length;c++) {// inner loop
				if(arr1[r][c]%2==0) {
				System.out.print(arr1[r][c]); //  all elements in the arr.
				}else {
					System.out.print(" ");// space for not print array value.
				}
			}
			System.out.println();
		}
	}
	void a7() {
	System.out.println("\n~~~~~Print below the Odd element of squre!!!~~~~~");
	for(int r=0;r<arr1.length;r++) { // outer loop for row. 
		for(int c=0;c<arr1[0].length;c++) {// inner loop
			if(arr1[r][c]%2!=0) {
			System.out.print(arr1[r][c]); //  all elements in the arr.
			}else {
				System.out.print(" ");// space for not print array value.
			}
		}
		System.out.println();
	}
}

	
}