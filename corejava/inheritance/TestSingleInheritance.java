package com.corejava.inheritance;
/* Single Inheritance:
 * When a class inherits another class, it is known as a single inheritance. 
 */
public class TestSingleInheritance {
// Customer class inherits Shop class
	public static void main(String[] args) {
		// object creating for the sub class
		Customer c=new Customer();
		//invoke the method 
		c.customer();
		c.salesMan();

	}

}
