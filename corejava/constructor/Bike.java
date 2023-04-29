package com.corejava.constructor;
/** Constructor:
 * a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
 *  At the time of calling constructor, memory for the object is allocated in the memory.
 * Rule for creating constructor:
 *  1) same class name 
 *  2)no return type
 * Note:
 * use access modifiers while declaring a constructor. It controls the object creation. 
 */
public class Bike {
	// creating default constructor
	Bike(){
		System.out.println("MT-15 is ready for you");
	}

	public static void main(String[] args) {
		Bike b=new Bike();// call or invoke the default construtor.
	}

}
