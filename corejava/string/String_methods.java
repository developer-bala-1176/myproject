package com.corejava.string;

public class String_methods {
	
	public static void main(String[] args) {
		String_methods s=new String_methods("Hello",1176);
		System.out.println(s);
		System.out.println("~~~~~~~~~~~");
		String s1=new String("Balasubramanian");
		String s2=new String("i am Balasubramanian. 1 am  from trichy. my mailid Bala@gmail.com.");
		System.out.println(s1.length());// length() --> length of the string.
		s.charAt(s1);// charAt method
		System.out.println("~~~~~~~~~~~");
		s.vowalsCount(s1);
		System.out.println("~~~~~~~~~~~~~");
		s.countOfwords(s2);
		System.out.println("~~~~~~~~~~~~~~~~~");
		s.counOfstantance();
		
		
}
	private void counOfstantance() {

		int i=0,count=0;
		String s2="i am Balasubramanian. 1 am  from trichy. my mailid Bala@gmail.com. ";
		while(i<s2.length()) {
			if(s2.charAt(i)=='.'){
				if(s2.charAt(i+1)==' ') {
				count++;
				}
			}i++;
		}
		System.out.println("no.of stantances:"+count);
		
	}
	private void countOfwords(String s2) {
		int i=0,count=1;
		while(i<s2.length()) {
			if(s2.charAt(i)==' '){
				count++;
			}i++;
		}System.out.println("no.of words:"+count);
		
	}
	String name;
	int id;
	public String_methods(String name, int id) {
		this.id=id;
		this.name=name;
	}public String toString() { // toString method
		return this.name+" "+id;
	}
public void charAt(String s1) {
	int i=0;
	while(i<s1.length()) {
	System.out.println(s1.charAt(i));// index baase print -->charAt(); 
	i++;
	}
}
	public void vowalsCount(String s1) {
		int i=0,count=0;
		while(i<s1.length()) {
			char ch=s1.charAt(i);
		switch(ch) {
		case 'a':
			
			System.out.println(s1.charAt(i));
			count++;
			break;
		case 'e':
			
			count++;
			break;
		case 'i':
			System.out.println(s1.charAt(i));
			count++;
			break;
		case 'o':
			System.out.println(s1.charAt(i));
			count++;
			break;
		case 'u':
			System.out.println(s1.charAt(i));
			count++;
			break;
		
		}i++;
		}System.out.println(count);
	}
	
	
}
