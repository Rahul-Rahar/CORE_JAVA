package com.CoreJava;

public class Ch02_OPERATORS_05_Precedence_Associativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* PRECEDENCE OF OPERATORS :-
		 *                           The Operators are applied and evaluated based on precedence. 
		 *                           For example (+,-) has less precedence compared to (*,/). Hence * & / are evaluated first than + & -.
		 *                           
		 *                           In case we like to change this order, we use Parenthesis(), because it has highest Precedence.
		 */
		
		int a = 4 + 5 - 4*5/10;
		System.out.println(a); //Here 4*5 will be evaluated first then divided by 10 and then 4+5 and substraction.

		
		
		/* ASSOCIATIVITY :-
		 *                 Associativity tells the direction of execution of operators.
		 *                 It can either be Left to Right or Right to Left.
		 *                 
		 *                 * / ---> L to R
		 *                 +-  ---> L to R
		 *                 --,++ ---> R to L.
		 */
		
		int x = 4*5/10; // Here * & / has equal Precedence so the solution of program starts from Left to Right.
		System.out.println(x); // Here first 4 multiply with 5 and then they divided to 10 as Left to Right Associativity.
	}

}
