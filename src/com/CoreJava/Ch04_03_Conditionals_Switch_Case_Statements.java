package com.CoreJava;
import java.util.Scanner;
public class Ch04_03_Conditionals_Switch_Case_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// SWITCH CASE STATEMENTS :- 
		/*                            A 'switch' statement allows you to execute one block of code among
		                            many options. It works by evaluating a single exoression and matching its value
		                            against multiple case labels. When no match is found, the optional 'default' case can be executed.
		                            */
		
		// Syntax of Switch Case Statement
		/*
		switch (expression) {
		case value1:
			// Code Execution for Value1.
			break;
			
		case value2:
			// Code Execution for value2.
			break;
			
		// Additional Values Can also be added....
			
		default:
			// Default Code will execute if no Case is matched.
		}
         */
		
		
		// EXAMPLES
		
		int day = 3;
		String dayName;
		
		switch (day) {
		     case 1: 
		     		dayName = "Monday"; // Prints Monday if int day = 1
		     		break; // Terminates the rest of switch statement and stop it if above condition met. 
		     
		     case 2:
		            dayName = "Tuesday"; // Prints Tuesday if int day = 1
		            break;
		     
		     case 3:
		            dayName = "Wednesday"; // Prints Wednesday if int day = 1
		            
		     case 4:
	     		 	dayName = "Thursday"; // Prints Thursday if int day = 1
	     		break;
	     
		     case 5:
	            	dayName = "Friday"; // Prints Friday if int day = 1
	            break;
	     
		     case 6:
	            	dayName = "Saturday"; // Prints Saturday if int day = 1
		        break;
	            
		     case 7:
		     		dayName ="Sunday"; // Prints Sunday if int day = 1
		     	break;
		     	
		     default:
		            dayName = "Valid Input Please."; // Prints "Valid Input Please" if none of the above conditions met.
		        break;
		 
		            
		}
		
		System.out.println(dayName);
		
		
		
		
		
		// break :- Terminates the current case and exits the switch statement code. If not, the code will "fall through" to the next case.
		
		
		// SIMPLE SMALL EXAMPLE TO UNDERSTAND THE "break" Keyword Properly.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number in the range of 1 to 3 ");
		int number = sc.nextInt();
		switch (number) {
		
		
		case 1:
			System.out.println("Number is 1");
			
		case 2:
			System.out.println("Number is 2");
			
		case 3:
			System.out.println("Number is 3");
			
		default:
			System.out.println("Number is not in the range of 1 to 3");
		}
		
		
		// Without 'break;' the cases fall through, meaning all subsequent case blocks execute until a 'break;' or the switch ends.
		// If number enters = 1, The Output will be:
		                  /*    Number is 1
		                      Number is 2
		                      Number is 3
		                      Number is not in the range of 1 to 3.
		                  */
		
		
		// default :- If we enter Number not in range of 1 to 3. The last default code block will executed.
		
		
		
	}

}
