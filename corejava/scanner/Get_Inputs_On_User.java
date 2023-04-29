package com.corejava.scanner;

import java.util.Scanner;

public class Get_Inputs_On_User {
	public void formula() {
		//a2+b2+2ab
		int a,b,c;
		Scanner inputs=new Scanner(System.in); 
		System.out.println("Enter a value a:");
		a=inputs.nextInt();
		System.out.println("Enter a value b:");
		b=inputs.nextInt();
		c=((a*a)+(b*b)+(2*a*b));
		System.out.println("Result:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Get_Inputs_On_User f=new Get_Inputs_On_User();
		f.formula();
		Scanner sc=new Scanner(System.in); //input as a variable name,new is used runtime memory allocation. Get input on the console.
        System.out.print("\nEnter Your Name:");
        String name=sc.nextLine();
        System.out.println("This Your name is :"+name);
        System.out.print("Enter your Age:");
        short age=sc.nextShort();
        System.out.println("This your Age is:"+age);
        System.out.print("Enter your MobileNumber:");
        long mobilenum=sc.nextLong();
        System.out.println("This is your Mobile number:"+mobilenum);
        System.out.print("Enter your Favorite Decimal Number:");
        double v=sc.nextDouble();
        System.out.println("This your Favorite Decimal Number:"+v);
        System.out.println("Are you know the value pi!!! ");
        System.out.print("Enter the right answer:");
        float pi=sc.nextFloat();
        System.out.println("your answer:"+pi);
        System.out.print("What's your favorite 5 digit number:");
        int num=sc.nextInt();
        System.out.println("your favorite 5 digit number:"+num);
        System.out.print("choose the num in 0-125:");
       byte n=sc.nextByte();
       System.out.println("your choosing :"+n);
	
	}

}
