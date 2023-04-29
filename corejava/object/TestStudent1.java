package com.corejava.object;

public class TestStudent1 {
	// Initialze object by using Method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crreate object
		Student1 s1=new Student1();
		/*create multiple objects at one line.
		 *  Create multiple object by one type.it possiable in case of primitives only.
		 */
		Student1 s2=new Student1(),s3=new Student1();
		//Initialzing object
		s1.insertRecord(104004,"Bala");
		s2.insertRecord(104005, "Surya");
		s3.insertRecord(104006,"Vicky");
		//Printing method 
		s1.displayInformation();
		s2.displayInformation();
		s3.displayInformation();
		
	}

}
