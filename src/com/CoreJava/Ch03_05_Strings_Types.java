package com.CoreJava;

public class Ch03_05_Strings_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String name = "Rahul";
		
		// NOTE :- INDEX ALWAYS STARTS FROM 0, as R(0), a(1), h(2), u(3), l(4).
		
		
		/* 10-  name.charAt(1) :-
		 *                        Returns Character at Entered 'Index' no.
		 *                        As if we entered name.charArt(1), it will give output as 'a'
		 *                        bcz 'a' is at Index 1. 
		 */
		
		
		System.out.println("1st char of String name is : " +name.charAt(1)); // Gives output as 'a'
		System.out.println("3rd char of String name is : " +name.charAt(3)); // Gives output as 'u'
		

		
		/* 11- name.indexOf("hu") :- 
		 *                           Returns the index of the given String.
		 *                           For ex: name.indexOf("hu") returns '2' which
		 *                           is the first index or occurence of "hu" in String "Rahul. 
		 */
		
		
		System.out.println("Index start of 'hu' is : " +name.indexOf("hu")); // Returns 2
		System.out.println("Index start of 'ahu' is : " +name.indexOf("ahu")); // Returns 1
		System.out.println(name.indexOf("ag12")); // Returns -1 if no Substring index no. not matched or found.
		
		
		// Taking a New String of another Methods
		
		String modifiedName = "Raahuulaahuul";
		
		
		/* 12- modifiedName.indexOf("aah", 6) :- Returns the index of the given String
		 *                                       Starting from the index 6(int).                                     
		 */
		
		
		System.out.println(modifiedName.indexOf("aah" , 6));// Returns 7 because it ignores
		                                                   // all previous indexes bcz of ("aah" , 6).
		
		System.out.println(modifiedName.indexOf("a3h" , 6)); // returns -1 if no Substring index found or Matched.
		
		
		
		
		/* 13- modifiedName.lastIndexOf("aah") :- Starts giving index from last of the String.
		 *                                        In this case it will give 7, because It returns index from last of String.
		 * 
		 */
		
		
		
		System.out.println(modifiedName.lastIndexOf("aah")); // Gives 7\
		System.out.println(modifiedName.lastIndexOf("aah", 6)); // Starts searching Index from 6th no. and
		                                                        // Ignores forwards one and gives output as 1.
		
		
		
	}

}
