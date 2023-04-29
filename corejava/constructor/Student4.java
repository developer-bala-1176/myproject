package com.corejava.constructor;
/**Copy construtor:
 * There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor 
 * 
 *
 */
public class Student4 {
	//initialize the values from one object to another object.  
	  
	    int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    Student4(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    Student4(Student4 s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Student4 s1 = new Student4(111,"Kamaraj");  
	    Student4 s2 = new Student4(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  