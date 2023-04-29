package com.corejava.inheritance;
/**
 * MultilevelInheritance:
 *        The chain of Inheritance,It is known as MultilevelInheritance.
 * chain of Inheritance:
 *  Class Bike --extends--> Class BikeParts --extends--> Class Vehiacal.
 *
 */
public class TestMultilevelInheritance {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.version();
		b.engine();
		b.run();

	}

}
