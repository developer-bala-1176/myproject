package com.corejava.escape_sequence;

public class All_EscapeSequence {
// Escape sequence of the output statement.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// \t --> It gives a tab between the two words.
		System.out.println("Good moring bala!\thave a nice day to you!");
		/* \b -->Backspace... It move the cursor one character back with.
		 with out deleting the character is depomding upon the compiler.
		 */
		System.out.println("\nAre You have any chocolate!!! Yes.");//without \b
		System.out.println("Are You have any chocolate!!! \bYes.");//with \b
		
        // \n -->  Create a new line.
		System.out.println("\nIt is nice bike!MT-15");//without \n
		System.out.println("It is nice bike!\nMT-15");//with \n
		
		/*
		 * \r  --> Carriage return.
		 *         It move to the outpt point back to the begining of the line without moving or creating new line.
		 */
		System.out.println("\nMy mobile is very damage\rso i have buy a new one!");
		
		// \f --> Feed character. It's indicate a page break.
		System.out.println("\nGood morning Bala! \fyou want tea or coffee!!!");
		
		// \' ---> Printing the single quotation mark on the text string.
		       System.out.println("\n\'i'm the java developer!\'"); 
		       
		// \" ---> Printing the double quotation mark on the text string.
		       System.out.println("\"i'm the java developer!\" "); 
		       
		// \\ --> Prining the backspace on the text in the string
		       System.out.println("\nwelcome to the software field \\BALA!!!\\");
	}

}
