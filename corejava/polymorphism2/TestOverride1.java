package com.corejava.polymorphism2;

public class TestOverride1 {
// create methods and invoke the object.
	public static void main(String[] args) {
		Sbi s=new Sbi();
		Icic i =new Icic();
		Hdfc h =new Hdfc();
       System.out.println("Sbi Rate of interest:"+s.rateOfInterest());
       System.out.println("Icic Rate of interest:"+i.rateOfInterest());
       System.out.println("Hdfc Rate of interest:"+h.rateOfInterest());
	}

}
