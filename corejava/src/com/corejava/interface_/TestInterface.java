package com.corejava.interface_;
/**
 * Interface:
 *   An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * Usage:
 *   It is used to achieve abstraction.
     By interface, we can support the functionality of multiple inheritance.
     It can be used to achieve loose coupling.
     
     
   There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

  In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

  Java Interface also represents the IS-A relationship.
 */
public class TestInterface implements Printable{
	public void print() {
		System.out.println("Hello!!!");
	}
public static void main(String args[]) {
	TestInterface t=new TestInterface();
	t.print();
}
}
