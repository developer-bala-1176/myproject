package com.corejava.exception;

public class Throw_Exception {
	public static void main(String args[]) {
	int aa=056;
	int bb=0;
	if(bb!=0) {
		System.out.println(aa/bb);
	}else {
		throw new NullPointerException();
	}
   
}

}
