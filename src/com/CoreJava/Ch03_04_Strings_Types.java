package com.CoreJava;

public class Ch03_04_Strings_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rahul";
		
		/* 5- .substring(int, Start) :- Returns a substring from start to end where
		 *                              where substring method used, works only as integers only
		 *                              Like name.substring(2) starts name from 'u' and give output as "hul"
		 */
		System.out.println(name); // Output as "Rahul"
		System.out.println(name.substring(2)); // Output as "hul" as 2 starts as 0,1,2.
		                                       //Index of any string is always starts from '0'.
        System.out.println(name.substring(0));
        
        
        /* 6- .substring(int start, int end) :-
         *                                     Returns a substring from Start index to End index.
         *                                     Start Index is included but End index is excluded.
         *                                     As if we enter name.substring(1,4) it will output as 'ahu'but not 'ahul'
         *                                     because End index entered is not included.
         */
        
        
        System.out.println(name.substring(1,4)); // Output as 'ahu'
        System.out.println(name.substring(0,5)); // Output as 'Rahul' because it will give output before 5th number and 5th index is not in String, it gave no problem to Program.
         
        
        
        
        /* 7- .replace(oldChar with newChar) :-
         *                                     Returns a new String after replacing "Old Character" with a "New Character".
         *                                     
         */
        
        
        System.out.println(name.replace('h', 'k')); // It replaces 'h' in Rahul as 'k' which give output as "Rakul".
        System.out.println(name.replace("R", "Niy")); // Can replace one Character with many Characters, but after using Double Quotes "".
        
        
        
        
        // 8- .startsWith() :- Returns Boolean value as True or False if String starts
                            // With Entered query like name.startsWith("Rah");
        //                     It gives true because name variable Starts with "Rah".
        
        
        System.out.println(name.startsWith("Rah")); // Gives TRUE
        System.out.println(name.startsWith("Rac")); // Gives FALSE
        
        
        
        
     /* 8- .endsWith() :- Returns Boolean value as True or False if String Ends
                            With Entered query like name.startsWith("hul");
                            It gives true because name variable Ends with "hul".
          */

         System.out.println(name.endsWith("hul")); // Gives TRUE
         System.out.println(name.endsWith("cul")); // Gives FALSE
	}

}
