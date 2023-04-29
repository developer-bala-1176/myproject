package com.corejava.decision_making;

import java.util.Scanner;
//group switch
public class GroupSwitch {
// check alphabet vowel or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char c;
    System.out.println("Enter character:");
    Scanner in =new Scanner(System.in);
    c=in.next().charAt(0);
    switch(c) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    	System.out.println(c+" is vowel letter");
    	break;
    	default:
    		System.out.println(c+" is not vowel letter");
    		break;
    	
    }
  
	}

}
