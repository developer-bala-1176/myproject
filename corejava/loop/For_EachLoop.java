package com.corejava.loop;

public class For_EachLoop {
/*
 * For Each or Enhanced for:
 *     The for-each loop is used to traverse array or collection in Java.
 *     It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
       It works on the basis of elements and not the index. It returns element one by one in the defined variable.
     Syntax:
       for(data_type variable : array_name){    
          //code to be executed    
        }    
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array defition
          int ar[]= {432,3242,2342,2423};
          // printing array in for each
          for(int a:ar) { 
        	  System.out.println(a); 
          }
	}

}
