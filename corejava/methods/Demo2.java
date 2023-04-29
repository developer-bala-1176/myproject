package com.corejava.methods;

public class Demo2 {
	private int age=21;
	private String name="Bala";
	 public String getName(String name) { // accessor method 
	    	return name;
	    }
	    public void setName(String name) { // mutor method 
	    	this.name=name;
	    }
    public int getAge(int age) { // accessor method 
    	return age;
    }
    public void setAge(int age) { // mutor method 
    	this.age=age;
    }
    void display() { // display method use display the accessor and mutor method values.
    System.out.println(name+" "+age);
    }
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.display();
		
	}
}
