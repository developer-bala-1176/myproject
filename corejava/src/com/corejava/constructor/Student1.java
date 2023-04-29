package com.corejava.constructor;
/**
 *1)Default constructor:
 * A constructor is called "Default Constructor" when it doesn't have any parameter.
 * Usage:
 *  It is used to provide the default values to the object like 0,null it's depanding on the type.
 * Note:
 *   If there is no constructor in a class, compiler automatically creates a default constructor.
 */
//Code to displays the default values use construtor.
public class Student1 { 
   int id;// Variable declaration.
   String name;
   byte b;
   boolean boo;
   float f;
   double d;
   long l;
// method to display variable value of id,name.
   void display() { 
	   System.out.println("int default value-->"+id+"\rString default value-->"+name+"\rbyte default value-->"+b+"\rboolean default value-->"+boo+" \rfloat default value-->"+f+" \rdouble default value-->"+d);
       System.out.println("long default value-->"+l);
   }
	public static void main(String[] args) {
		// creating object
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		//display default values
		s1.display();
		//s2.display();

	}

}
