package com.CoreJava;

public class Ch02_OPERATORS_07_Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// INCREMENT & DECREMENT OPERATORS
		
		/* a++, ++a ---> Increment Operators (Increase the Value of Operators by 1)
		 * a--, --a ---> Decrement Operators (Decrease the Value of Operators by 1)
		 * 
		 * Data Types will be the same.
		 */
		
		int a = 67;
		System.out.println(a++); // This will print previous value of 'a' as it is because increment(++) is used after the Variable.
		System.out.println(a); // Now the Incrementation is used so that it will print the increased the value of 'a'.

		
		int b = 45;
		System.out.println(++b); // Here Variable is Incremented first and then the value will be printed of 'b' as Increased value.
		
		int c = 56;
		System.out.println(c--); // c = 56
		System.out.println(c);   // c = 55
		System.out.println(--c); // c = 55-1 = 54
		
		
		// INCREMENT & DECREMENT IN CHARACTERS 'CHAR'.
		
		char w = 'B';
		System.out.println(++w); // Here the 'B' value in Variable 'w' is increased by 1 and now is 'C'.
		System.out.println(--w); // Decreased 'C' to 'B' again.
	}

}
