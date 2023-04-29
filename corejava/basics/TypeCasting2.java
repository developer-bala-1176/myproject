package com.corejava.basics;

public class TypeCasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * widening casting 
		 * byte -> short ->	char ->	int ->	long ->	float ->double
		 * Narrow casting
		 * double -> float ->long->int->char->short->byte
		 *  */
			int a=12;
			double b=a,d=23.3435;
			System.out.println("integer value:"+a);
			System.out.println("widening casting int into double :"+b);
			System.out.println("double value:"+d);
			int c=(int)d;
			System.out.println("narrow  casting double  into int :"+c);
			float e=(float)d;
			System.out.println("narrow  casting double  into short :"+e);
			long g=(long)d;
			System.out.println("narrow casting double into long:"+g);
		}

	}

