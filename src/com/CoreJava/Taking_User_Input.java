package com.CoreJava;

import java.util.Scanner; // Importing Scanner class for User Input

public class Taking_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reading Data from Keyboard
		
		// The Scanner class is used to get user input, and it is found in the java.util package.
		
		System.out.println("Taking Input from the User");
		Scanner sc = new Scanner(System.in); // From System.in means that we want to take input from Keyboard.
		
		// Some types of User Input in Scanner Class and their Examples---
		
		// 1. nextInt()  [For Integers]
	/*	System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum of these numbers is " +sum);
	*/
		
		
		// 2. nextFloat()  [for decimals input]
	/*	System.out.println("Enter number 1");
		float a = sc.nextFloat();
		System.out.println("Enter number 2");
		float b = sc.nextFloat();
		float sum = a + b;
		System.out.println("Sum of these numbers is " +sum);
 	*/
		
		
		// 3. hasNextInt()  [Check Whether entered number is Integer(float for decimals) or not (shows Boolean Values)]
	/*	boolean b1 = sc.hasNextInt();
		System.out.println(b1);
	*/
		
		
		// 4. next() and nextLine()  [for reading Strings from user Input]
	/*	String str = sc.next(); // Can read only first full word, unable to read 2nd or more words after a space between 2 words.
		System.out.println(str);
		
		String str = sc.nextLine(); // Can read full line words with space between them.
		System.out.println(str);
	*/	
		
		// UNCOMMENT ANY CODE TO RUN AND LEARN THEM
	}

}
