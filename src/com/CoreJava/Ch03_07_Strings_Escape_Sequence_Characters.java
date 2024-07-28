package com.CoreJava;

public class Ch03_07_Strings_Escape_Sequence_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// ESCAPE SEQUENCE CHARACTERS :-	
		                               /* A character with a backslash (\) just before 
		                                * it is an escape sequence or escape character. 
		                                * We use escape characters to perform some specific task. 
		                                * The total number of escape sequences or escape characters in Java is 8. 
		                                * Each escape character is a valid character literal.
		                                */
		
		
		// Sequence of Characters after backslash '\' = Escape sequence characters.
		// Escape Sequence Characters consist of more than one Characters but represents
		// one character used within the Strings.
		
		// Example : \n, \t, \', \\, etc.
		
		
		
		System.out.println("I am escape sequence \" react as double quote");
		System.out.println("I am escape sequence \\ also as a double quote");
		System.out.println("I am new line escape sequence \n given new line");


		// Types of ESCAPE SEQUENCES
		
		
		// 1.  \t or Tab
		
		System.out.println("Hello! \t My name is Rahul"); // Added Tab or big space between a String
		                          // Output is : Hello!		My name is Rahul.
		
		
		
		// 2. \b or Backspace
		
		System.out.println("Hello! \b My name is Rahul");
		
		
		
		// 3. \n or New Line
		
		System.out.println("Hello! \n My name is Rahul"); // Constructed New Line Between desired String.
		                        /* Output : Hello!
		                                    My name is Rahul  */
		
		
		
		// 4. \r or Carriage Return
		
		System.out.println("Hello! \r My Name is Rahul");
		
		
		
		// 5. \' or Single Quote Character
		
		System.out.println("Hello! \'My name is Rahul\'"); // Added single quote character in the line.
		
		
		
		// 6. \" or Double Quote Character
		
		System.out.println("Hello! \"My name is Rahul\""); // Added Double quotes around desired Code.
		
		
		
		// 7. \f or Form Feed
		System.out.println("Hello! \f My name is Rahul");
		
		
		
		// 8. \\ or backslash
		
		System.out.println("Hello \\ My name is Rahul"); // Added a Backslash Character in the Text.
		
		
		
		
		
		// Description about few Escape Sequences, we will learn later.
	}

}
