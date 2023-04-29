package com.corejava.operators;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35;

		System.out.println("post-increment:"+(a++));// print a then a+1=35+1=36
		System.out.println("Value of a="+a);// 36
		System.out.println("post-decreament:"+(a--));
		System.out.println("Value of a="+a);
		System.out.println("pre-increament:"+(++a));// 1+35=36
		System.out.println("Value of a="+a);//36
		System.out.println("pre-decreament:"+(--a));
		System.out.println("Value of a="+a);


		}
}


