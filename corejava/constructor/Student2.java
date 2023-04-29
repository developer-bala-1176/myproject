package com.corejava.constructor;
/**
 * Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.
 *
 *use of parameterized constructor?
   The parameterized constructor is used to provide different values to distinct objects. 
  However, you can provide the same values also.
 */
public class Student2 {
	 int id; // declare the global variable
	String name;
	// creating default construtor.
	Student2(int i,String n){
		id=i;
		name=n;
	}
	//method to display the value 
	void diplay() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// creat object and passing the value.
		Student2 s1=new Student2(100,"Bala");
		Student2 s2=new Student2(101,"Saranya");
		//diplay the value of construtor .
		s1.diplay();
		s2.diplay();
		

	}

}
