package com.CoreJava;

public class Ch02_OPERATORS_06_DataTypes_after_ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// RESULTING DATA TYPES AFTER ARITHMETIC OPERATIONS
		
		// Following Table and Examples summarizes the resulting data types after arithmetic operations on them.
		
		
		/* 1. R = b+s --> int                         1. R = C+i --> int
		 * 2. R = S+i --> int                         2. R = C+S --> int
		 * 3. R = l+f --> float						  3. R = l+d --> double
		 * 4. R = i+f --> float						  4. R = f+d --> double
		 */
		
		/* Here,  b --> byte,  S --> short,  i --> integer,  l --> long
                  f --> float,  d --> double,  C --> Character and R --> Result
                 
                  */
		
		char C = 'A';
		byte b = 12;
		short S = 345;
		int i = 4567;
		long l = 65473892;
		float f = 12.56f;
		double d = 23.6574832;
		
		
		// Now Performing the Results one by one.
		
		int R = b+S;
		System.out.println(R);
		
		int R2 = S+i;
		System.out.println(R2);
		
		float R3 = l+f;
		System.out.println(R3);
		
		float R4 = i+f;
		System.out.println(R4);
		
		int R5 = C + i;
		System.out.println(R5);
		
		int R6 = C+S;
		System.out.println(R6);
		
		double R7 = l+d;
		System.out.println(R7);
		
		double R8 = f+d;
		System.out.println(R8);
		
	}

}
