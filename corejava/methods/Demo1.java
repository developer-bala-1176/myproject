package com.corejava.methods;

public class Demo1 {
  /**
   * Instance method:
   *        The method of the class is known as an instance method. It is a non-static method defined in the class.
   *     Before invoking the instance method, it is necessary to create an object of its class.
   */
	public static void main(String[] args) {
		//display();
		// creating object
		Demo1 d =new Demo1();
		// invoke the method
		d.display();
	}
	// Non static method --> Instance method.
	public void display() {
		System.out.println("Instance method!!!");
	}

}
