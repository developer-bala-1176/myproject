package com.corejava.aggregation;

public class Employee {
	int id;
	String name;
	Address add;
	Employee(int id,String name,Address add) {
		this.id=id;
		this.name=name;
		this.add=add;
	}void display(){
		System.out.println("Id:"+id+" "+"Name:"+name);
		System.out.println("City:"+add.city+" "+"State:"+add.state+" "+"Country:"+add.country);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public static void main(String[] args) {
		//create object and pass value to Address class construtor.
		Address a1=new Address("Trichy","Tamilnadu","India");
		Address a2=new Address("Chennai","Tamilnadu","India");
		//create object and pass value to Employee class construtor.
		Employee emp=new Employee(10012,"Bala",a1);
		Employee emp1=new Employee(10013,"Murugan",a2);
		//print value
		emp.display();
		emp1.display();

	}

}
