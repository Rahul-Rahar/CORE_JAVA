package com.CoreJava;

public class Ch02_OPERATORS_01_Arithmatic_Operators {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// OPERATORS :- Operators are used to perform Operations on Variables and Values.

			
			/* ARITHMATIC OPERATORS :-
			 *                         Operators are used to perform operations on variables and values. 
			 *                         These Operations are such as Addition, Substraction, Multiplication and Division and much more.                    
			 */
			int num1=10;
			int num2=20;
			
			// 1. ADDITION
			
			int sum;
			
	        sum = num1 + num2; // ADDITION
	        
	        
	        System.out.println("Value after Addition of num1 + num2 :- " +sum);
	        
	        
	        // 2. SUBSTRACTION
	        
	        int sub;
	        
	        sub = num2 - num1 ; // SUBSTRACTION
	        
	        System.out.println("Value after Substraction of num2 - num1 :- " +sub);
	        
	        
	        // 3. MULTIPLICATION
	        
	        int multiply;
	        
	        multiply = num1 * num2 ;
	        
	        System.out.println("Value after Multiplication of num1*num2 :- " +multiply);
	        
	        
	        // 4. DIVISION
	        
	        int div;
	        
	        div = num2/num1;
	        
	        System.out.println("Value after Division of num2/num1 :- " + div);
	        
	        
	        // 5. MODULUS (%)
	        
	        int num3 = 102;
	        int num4 = 21;
	     
	        int mod;
	        mod = num3%num4;
	        
	        System.out.println("Modulus or Remainder after dividing num3/num4 using Modulus Operator as num3%num4 :- " + mod); 
	        // As we know 102/21 is not properly divided, so Modulus shows Remainder remaining after the division.
	        
	        
	        
	        // 6. INCREAMENT ++
	        
	        int x=50;
	        ++x; // It Increases the value of 'x' by 1 as 51.
	        
	        System.out.println("Increased Value of 'x' Variable :- " +x);
	        
	        
	        // 7. DECREAMENT --
	        
	        --x; // It Decreases the value of 'x' by 1 as increased 51 to again  50.
	        
	        System.out.println("Decrease value of 'x' Variable :- " +x);
	        
	        
		}

	}
