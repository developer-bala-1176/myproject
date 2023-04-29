package com.corejava.polymorphism2;
/**
 * Rules for instance initializer block :
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
 * @author ASUS
 *
 */
public class Demo2_I_Intial  extends Demo1 {
           Demo2_I_Intial() {
    	   super();
    	   System.out.println("Sub class is invoked!!!");
       }
           {
        	   System.out.println("After Super () keyword -->Instance Initializer is invoked ");
           }
	public static void main(String[] args) {
		Demo2_I_Intial a=new Demo2_I_Intial();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		Demo2_I_Intial aa=new Demo2_I_Intial();
	}

}
