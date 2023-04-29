package com.corejava.interface_;

public class TestInterface3  implements Showable2{

	public static void main(String[] args) {
		TestInterface3 tt=new TestInterface3();
         tt.print();
         tt.show2();
	}
	public void print() {
		System.out.println("Hello");
		
	}
	public void show2() {
		System.out.println("Welcome!!!");
		
	}

}
