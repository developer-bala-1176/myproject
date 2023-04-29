package com.corejava.object;

public class TestStudent {
// Initialze object by using refrencer variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crreate object
		Student s1=new Student();
		Student s2=new Student();
		//Initialzing object
		s1.id=1001;
		s1.name="Bala";
		s2.id=1002;
		s2.name="Surya";
		//printing the object
		System.out.println(s1.id+""+s1.name);
		System.out.println(s2.id+""+s2.name);

	}

}
