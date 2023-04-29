package com.corejava.constructor;
/**
 *  Construtor overloading:
 *          It can also be overloaded like Java methods.
 *Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
 *    They are arranged in a way that each constructor performs a different task.
 */
public class Employee3 {
       int emp_id;
       String emp_name;
       int emp_age;
       int emp_num;
       // Create two argument construtor.
       Employee3(int i,String n){
    	   emp_id=i;
    	   emp_name=n;
       }
       // Create three argument construtor.
       Employee3(int i,String n,int a){
    	   emp_id=i;
    	   emp_name=n;
    	   emp_age=a;
       }
    // Create four argument construtor.
       Employee3(int i,String n,int a,int n1){
    	   emp_id=i;
    	   emp_name=n;
    	   emp_age=a;
    	   emp_num=n1;
       }
       // method to print the values 
       void displaty() {
    	   System.out.println(emp_id+" "+emp_name+" "+" "+emp_age+" "+ emp_num);
       }
	public static void main(String[] args) {
		//create object and passing value in parameter.
		 Employee3  e=new Employee3 (10001,"BALA"); 
		 Employee3  e1=new Employee3 (10002,"SURYA"); 
		 Employee3  e2=new Employee3 (10001,"BALA",21); 
		 Employee3  e3=new Employee3 (10002,"SURYA",21); 
		 Employee3  e4=new Employee3 (10002,"SURYA",21); 
		 Employee3  e5=new Employee3 (3245,"SARANYA",1,122);
		 //call or invoke the construtor
		 e.displaty();
		 e1.displaty();
		 e2.displaty();
		 e3.displaty();
		 e4.displaty();
		 e5.displaty();

	}

}
