package com.CoreJava;

public class Ch03_06_Strings_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// STRINGS METHODS
		
		
		String name = "Rahul";
		
		
		/* 14- name.equals("Rahul") :- Returns Boolean Result 'True' if the given string
		 *                             matches with input string, otherwise false. 
		 * 
		 */
		
		System.out.println(name.equals("Rahul")); // True bcz input string matches with given String Name.
		System.out.println(name.equals("rahul")); // False because Java is a Case sensitive language and
		                                          // 'rahul' as a new String.
		
		
		
		/* 15- name.equalsIgnoreCase() :- It ignores any uppercase or lowercase, just matches value only.
		 *                                It ignores Case sensitive formula of Java. 
		 */
		
		
		System.out.println(name.equalsIgnoreCase("RAHUL")); // True because Ignores Case Sensitive Rule.
		System.out.println(name.equalsIgnoreCase("rAhUL")); // True because all Characters Matches.
	}

}
