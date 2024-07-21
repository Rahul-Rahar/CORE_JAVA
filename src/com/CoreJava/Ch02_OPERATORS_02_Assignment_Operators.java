package com.CoreJava;

public class Ch02_OPERATORS_02_Assignment_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ASSIGNMENT OPERATORS :- Assignment Operators are simple Operators which ASSIGNS some values to Variables.
		
		int a = 10; // Here 'a' is a variable and '10' is it's value but '=' is an Operators which insures that this value is of that Variable.
		System.out.println(a);
		
		// a(Variable) =(Operator) 10(Value);
		
		// COMPOUND ASSIGNMENT OPERATORS (SHORTHAND ASSIGNMENT OPERATORS) :- Compound Assignment Operators provides a shorter 'SYNTAX' for assigning the values.
		
		// 1. += (COMPUND ADDITION)
		
		int x = 10;
		x += 10; // Adds extra Provided Value to Variable 'x', hence the OUTPUT is x = 10 + 10 = '2'.
		System.out.println(x);
		
		
		
		// 2. -= (COMPOUND SUBSTRACTION)
		
		int y = 20;
		y -= 19; // Subtracts extra Provided Value to Variable 'y', hence the Output is y = 20 - 18 = '1'.
		System.out.println(y);
		
		
		
		// 3. *= (COMPUND MULTIPLICATION)
		// 4. /= (COMPUND DIVISION)

	}

}
