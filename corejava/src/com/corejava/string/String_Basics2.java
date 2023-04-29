package com.corejava.string;

public class String_Basics2 {

	public static void main(String[] args) {
		//2) By new keyword
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("welcome");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);    

	}

}
