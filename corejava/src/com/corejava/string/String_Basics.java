package com.corejava.string;
/*
 * String:
 *    String is class.it find im the java.lang package.
 *    String's are stird in String constant pool (it's a part of Heap area).  
 *    It's immutable.
 */
public class String_Basics {

	public static void main(String[] args) {
		//it is basically an object --> squence of character values.
		// Array of char also same works.
        char[] ch= {'j','a','v','a'};
        String s=new String(ch);//No need to import bcz it in the java.lang package -->implicit object.
        System.out.println(s);
        String s1="java";//input string use with or without new keyword(special function of string).
        System.out.println(s1);
        
        /**
         * There are two ways to create String object:
                 1) By string literal
                 2) By new keyword
           1)Each time you create a string literal, the JVM checks the "string constant pool" first. 
           If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. 
         */
        //  1) By string literal
        String s3="bala";// literal is created by using double quotes. 
        System.out.println(s3);
        System.out.println(s3.hashCode());
        String s4="bala";
        System.out.println(s4);
        System.out.println(s4.hashCode());//memory location not change.
        String s5="bala";
        System.out.println(s5);
        System.out.println(s5.hashCode());
        s5="dgs";
        System.out.println(s5);
        System.out.println(s5.hashCode());
        
      
        
	}

}
