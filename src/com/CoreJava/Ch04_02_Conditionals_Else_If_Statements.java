package com.CoreJava;
import java.util.Scanner;
public class Ch04_02_Conditionals_Else_If_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* ELSE IF STATEMENTS IN JAVA CONDITIONALS 
                                                 In Java, the 'else-if' statement is a control
                   flow structure that allows you to test multiple conditions in sequence.
                   It's used when you have more than one condition to evaluate and want to 
                   execute different code blocks based on which condition is true.
                   The 'else-if' statement follows an initial 'if' statement and can be
                   followed by additional 'else-if' statements. If none of the conditions are met,
                   an optional 'else' block can execute a default action.
                               */
		
		
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		int age = sc.nextInt();
		
		if (age>60) {
			System.out.println("You are fully Experienced!"); // If the Statement Meets this Condition, Then the code will execute.
			                                                  // It will not check other conditions.
		}
		
		else if(age>40) {
			System.out.println("You are Semi-Experienced!"); // If the first condition is not true, then Java checks this.
			                                                 // If this is True, it will not check others.
		}
		
		else if (age>30) {
			System.out.println("You are little Experienced!");
		}

		else {
			System.out.println("You are not Experienced!"); // If none of the else-if conditions are True, then this will Execute(If available in the code).
		}
		
		
		
		
		// ANOTHER EXAMPLE
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Name of Suspect ");
		String name = sc2.nextLine();
		
		String database = "Franklin";
		String database2 = "Niko";
		String database3 = "CJ";
		String database4 = "Michelle";
		
		if (name.equalsIgnoreCase(database)) {
			System.out.println("Suspect Found in Databse 1");
		}
		
		else if (name.equalsIgnoreCase(database2)) {
			System.out.println("Suspect found in Database 2");
		}
		
		else if (name.equalsIgnoreCase(database3)) {
			System.out.println("Suspect found in Database 3");
		}
		
		else if (name.equalsIgnoreCase(database4)) {
			System.out.println("Suspect found in Database 4");
		}
		
		else {
			System.out.println("No Criminal Records found of Suspect in any Database.");
		}
		
		
	}

}
