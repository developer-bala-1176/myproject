package com.corejava.polymorphism1;
/**  method overload:
 *            a class has multiple methods having same name but different in parameters, it is known as Method Overloading. *
 */
public class TestOverload {
// By changeing no.of arguments
	public static void main(String[] args) {
		// ststic method so need create object.
		// invoke and pass value to method 
		System.out.println(Adder.add(10,20));//two argument
		System.out.println(Adder.add(10,20,30));//three argument
	}

}
