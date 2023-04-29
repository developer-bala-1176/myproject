package com.corejava.object;

public class AnonymousObject {
    void factorial(int n) {
    	int fact=1;
    	for(int i=1;i<=n;i++) {
    		fact=fact*i;
    	}
    	System.out.println(n+"!="+fact);
    }
    public static void main (String args[]) {
    new AnonymousObject().factorial(5);// calling method with anonymous object.
    }
}
