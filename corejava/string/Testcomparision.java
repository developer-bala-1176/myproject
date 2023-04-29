package com.corejava.string;
/**
 * The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.

It compares strings on the basis of the Unicode value of each character in the strings.

If the first string is lexicographically greater than the second string, it returns a positive number (difference of character value). If the first string is less than the second string lexicographically, it returns a negative number, and if the first string is lexicographically equal to the second string, it returns 0.

if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  
 * 
 *
 */
public class Testcomparision {

	public static void main(String[] args) {
	   String s1="Bala";
	   String s2="Bala";
	   String s3=new String("Bala");
	   String s4="Ratan";
       String s5="BALA";
       System.out.println("equals() method!");
       System.out.println(s1.equals(s2));//true
       System.out.println(s1.equals(s3));//true
       System.out.println(s1.equals(s4));//false
       System.out.println(s1.equals(s5));//false
       System.out.println(s1.equalsIgnoreCase(s5));//true (bcz equalsIgnoreCase() method ).
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("equalto operetor (==):");
       System.out.println(s1==s2);//true  (bcz both refers to same  instance )
       System.out.println(s1==s3);//false (bcz s3 refers to instance created in non-pool.)
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("compareTo() method:");
       System.out.println(s1.compareTo(s2));//0
       System.out.println(s1.compareTo(s4));//-16
       System.out.println(s4.compareTo(s1));//16
      
	}

}
