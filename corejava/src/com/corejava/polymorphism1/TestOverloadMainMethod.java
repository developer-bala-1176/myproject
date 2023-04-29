package com.corejava.polymorphism1;

public class TestOverloadMainMethod {
// Try to overload the main method.but the JVM can take  main(String[] args) only.
	public static void main(String[] args) {
		System.out.println("String[] args");// call this method only.
	}
	public static void main(String args) {
		System.out.println("only String args");

	}
	public static void main() {
		System.out.println("without String arg");

	}

}
