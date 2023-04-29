package com.corejava.encapsulation;

public class Employee {
   private int emp_id;
   private String emp_name;
   private String emp_mail;
   private long emp_mobilenumber;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmp_mail() {
	return emp_mail;
}
public void setEmp_mail(String emp_mail) {
	this.emp_mail = emp_mail;
}
public long getEmp_mobilenumber() {
	return emp_mobilenumber;
}
public void setEmp_mobilenumber(long emp_mobilenumber) {
	this.emp_mobilenumber = emp_mobilenumber;
}
public static void main(String[] args) {
	 Employee e=new  Employee();
	 //set value using seter method
	 e.setEmp_id(1011);
	 e.setEmp_name("Bala");
	 e.setEmp_mail("Bala@123");
	 e.setEmp_mobilenumber(344558489);
	 //output the value using getter method
	System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+ e.getEmp_mail()+" "+ e.getEmp_mobilenumber()); 
}
}
