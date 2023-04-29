package com.corejava.object;

public class Student1 {
	int rollno;  // Declare the variable.
	String name;
	// Create a two method insertRecord,displayInformation.
    void insertRecord(int r,String n) { 
    	rollno=r; // assign the value r to rollno.
    	name=n; // assign the value n to name.
    }
    void displayInformation() {
    	System.out.println(rollno+" "+name);//Printing values.
    }

}
