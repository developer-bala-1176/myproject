package com.corejava.inheritance;
/**
 * Hierarchical Inheritance:
 *        Two or more classes Inherits a single class,it's known as Hierarchical.
 */
public class TestHierarchicalInheritance {
	public static void main(String[] args) {
		// create a object for Cat class.
		Cat c=new Cat();
		c.cat();
		c.eat();
		//c.dog(); --> Error this is not access the Dog class.
		// No relation between the Cat and Dog classes so Cat class object can't be access the Dog class properties. --> c.dog(); --> Error
	}

}
