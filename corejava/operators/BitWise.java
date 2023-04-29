package com.corejava.operators;

public class BitWise {
	void bitwiseex() {
		 int a=9,b=12,c=24,d=8,e=39,f=98 ;
         System.out.println("Bitwise AND!!!");
         System.out.println(a&b);
         System.out.println(c&d);
         System.out.println(e&f);
         System.out.println("\nBitwise OR!!!");
         System.out.println(a|b);
         System.out.println(c|d);
         System.out.println(e|f);
         System.out.println("\nBitwise XOR!!!");
         System.out.println(a^b);
         System.out.println(c^d);
         System.out.println(e^f);
         System.out.println("\t");
 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitWise  obj = new BitWise ();
		obj.bitwiseex();
		int a=25,b=45;
		 System.out.println("\nBitwise AND:");
		 System.out.println(a&b);
		 System.out.println("Bitwise OR:");
	     System.out.println(a|b);
	     System.out.println("Bitwise XOR:");
	     System.out.println(a^b);
	     System.out.println("Bitwise NOT:");
	     System.out.println(~a);
/*Bitwise AND:
 0		0	0
 0		1	0
 1		0	0
 1		1	1
Bitwise OR:
 0		0	0
 0		1	1
 1		0	1
 1		1	1

Bitwise XOR:
 0		0	0
 0		1	1
 1		0	1
 1		1	0
Bitwise NOT:
0     1
1     0
*/
	}

}
