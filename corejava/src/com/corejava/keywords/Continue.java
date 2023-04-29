package com.corejava.keywords;

public class Continue {
	/* continue:
	 *   continue statement to skip the
            execution of loop(based on some condiition. 
	 */
	public static void main (String ags[]) {
		 // For loop for iteration
        for (int i = 0; i <= 15; i++) {
 
            // Check condition for continue
            if (i == 10 || i == 12 || i==1) {
 
                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");

}
	}
}
