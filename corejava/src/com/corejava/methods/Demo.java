package com.corejava.methods;

public class Demo {
/**
 * Static Method
  *   A method that has static keyword is known as static method.
 static method by using the keyword static before the method name.

*The main advantage of a static method is that we can call it without creating an object. 
*It can access static data members and also change the value of it. It is used to create an instance method. 
*    It is invoked by using the class name. 
*The best example of a static method is the main() method.
 */
	public static void main(String[] args) {
		// Call  static method without creating object.
		show();

	}
	 // creating static method 
	public static void show() {
		System.out.println("This is static method!!!");
		
	}

}
