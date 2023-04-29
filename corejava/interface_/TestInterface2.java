package com.corejava.interface_;
/**
 * Multiple inheritance Achieve in the interface only.
 *  Class   --implements--> Interface,interface.
 *  interfacae --ectends--> Interface,interface.
 */
public class TestInterface2 implements Printable,Showable { //	Achieve multiple inheritance
	public void show() { 
		System.out.println("Welcome!!!");
	}
	public void print() {
		System.out.println("Hello!!!");
	}
public static void main(String args[]) {
	TestInterface2 t=new TestInterface2();
	t.print();
	t.show();
}

}
