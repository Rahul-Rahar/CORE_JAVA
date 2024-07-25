package com.CoreJava;

public class Ch03_03_Strings_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// STRING METHODS & TYPES
		/* String methods operate on Java Strings. They can be used to find
		 * of String, Convert to lowercase, Uppercase etc.
		 */
		
		String name = "Rahul"; // The word counting in Strings starts from 0, like 01234=Rahul.
		System.out.println(name);
		
		// Methods of Strings 
		
		// 1 - .length() :- Returns or displays the Length of Variable's Value in Strings
		
		String Length = ("Count Length");
		int count = Length.length(); // int because result is an integer as counting is an integer type.
		System.out.println(count); // 12, Counts space also but doesn't starts with 0 this time because this is Counting.
		
		
		
		// 2 - .toLowerCase() :- Returns a new String which has all the lowercase characters from Old String.
		
		String lower = ("LOWERCASE"); // all the Alphabets are Uppercase.
		System.out.println("All Alphabets are UPPERCASE in " +lower);
		String lstring  = lower.toLowerCase(); // Changes String "Lower"s Uppercase Alphabets to Lowercase Alphabets with a New String Name lstring.
		System.out.println("All alphabets changed to LOWERCASE in " +lstring); // "lowercase from ""LOWERCASE".
		
		
		
		// 3 - .toUpperCase() :- Same as .toLowerCase , changes lowercase alphabets in Uppercase alphabets.
		
		
		
		// 4 - .trim() :- Returns a string after Removing all the leading and trailing spaces from original string.
		
		String nonTrimmedString = "            Rahul             "; // This String has  unwanted Spaces in his Value.
		System.out.println("String with Unwanted Spaces" +nonTrimmedString);
		
		String TrimmedString = nonTrimmedString.trim();
		System.out.println("String after removing unwanted spaces " +TrimmedString); // now Unwanted spaces and Trailing sapces are removed
		
		
		
		
		
		
		
		

	}

}
