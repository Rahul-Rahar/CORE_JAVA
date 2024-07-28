package com.CoreJava;

public class Ch03_Practice_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Write a Java Program to convert a String to Lowercase.
		
		
		String name = "HELLO SIR"; // All letters are Upper Case.
		name = name.toLowerCase();
		System.out.println(name); // Now all Letters are Converted into Lower Case. And if we see Question properly
		                          // we have to change string to lower case not to print in Lower Case.
	
	
	   
		
		// 2. WRITE A JAVA PROGRAM TO REPLACE SPACES WITH UNDERSCORES(_).
		
		
		String name2 = "What is your name?";
		name2 = name2.replace(' ', '_');
		System.out.println(name2); // Replaced Spaces with Underscores.
		
		
		
		/* 3. WRITE A JAVA PROGRAM TO FILL IN A LETTER TEMPLATE WHICH LOOKS LIKE:
		 *      letter = "Dear <|name|>, Thanks a lot"
		 *      
		 *      REPLACE <|name|> with a STRING (Some name).
		 */
		
		
		String letter = "Dear <|name|>, Thanks a lot";
		letter = letter.replace("<|name|>", "Rahul");
		System.out.println(letter); // Replaced <|name|> with a String "Rahul".
		
		
		
		// 4.WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING.
		
		
		String spaces = "Hello   How are you?";
		System.out.println(spaces.indexOf("   ")); // Detects if there spaces or not and Starts on which Index.
		System.out.println(spaces.indexOf("  "));  // Detects if two spaces or not and Starts on which Index. -1 if unable to detect.
		System.out.println(spaces.indexOf("    ")); // -1 because no 4 spaces
		
		
		/* 5. WRITE A PROGRAM TO FORMAT THE FOLLOWING LETTER USING ESCAPE SEQUENCE CHARACTERS.
		*  letter2 = "Dear Harry, This Java Course is nice. Thank You"
		*/
		
		
		String letter2 = "Dear Harry, This Java Course is nice. Thank You";
		System.out.println("Dear Harry, \n \t This Java Course is nice. \nThank You! "); // Made this as Escape Sequence formulas.
	
	}

}
