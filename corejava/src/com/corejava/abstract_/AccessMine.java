package com.corejava.abstract_;
/** Absract method and class:
 * A class which is declared with the abstract keyword is known as an abstract class in Java. 
 * It can have abstract and non-abstract methods (method with the body).
 * 
 *Rule:
 *  An abstract class must be declared with an abstract keyword.
  It can have abstract and non-abstract methods.
  It cannot be instantiated.
  It can have constructors and static methods also.
  It can have final methods which will force the subclass not to change the body of the method.
 */
public class AccessMine extends Mine {
	void pen() {
		System.out.println("This is my pen");
	}
	void bag() {//implementation
		System.out.println("This is my bag");
	}

	public static void main(String[] args){
		AccessMine obj=new AccessMine();
		obj.pen();
		obj.bag();
		obj.scale();
		

	}

}
