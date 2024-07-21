package com.CoreJava;

public class Ch02_OPERATORS_04_LOGICAL_OPERATORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// LOGICAL OPERATORS :- Logical Operators checks whether an Expression or Multiple Expressions are True or Not.
		
		
		
		// 1. && (LOGICAL AND) :- Logical And operator checks if the Outcome of 'Two expressions or conditions are True or False'.
		// Gives Result as'True' only if "Both the comnditions or Expressions are True, otherwise 'False'".
		
		int a = 20;
		int b = 40;
		boolean result = (a<b) && (a!=b);
		System.out.println(result); // Outcome is 'True' because both conditions are True.
		
		
		
		/* 2. || (LOGICAL OR) :- Logical OR operators Gives 'TRUE' as boolean Result even if
		                      One Expression is False and another is True. */
		
		int num1 = 30;
		int num2 = 80;
		
		int x = 32;
		int y = 32;
		
		boolean result2 = (num1>num2) || (x==y);
		System.out.println(result2); // Result is 'TRUE'because "num1 is not greater than num2, but x is equal to y".
		
		
		
		// 3. ! LOGICAL NOT :- If the Expression or Condition is 'False' then Logical Not operator prints out Result as 'TRUE'.
		
		int r = 20;
		int t = 89;
		
		boolean result3 = !(r==t);
		System.out.println(result3); // Reverses the Outcome as True because Condition is 'False'.

	}

}
