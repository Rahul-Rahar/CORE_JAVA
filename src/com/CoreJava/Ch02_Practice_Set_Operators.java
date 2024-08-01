package com.CoreJava;
import java.util.Scanner;
public class Ch02_Practice_Set_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. What will be the result of the folllowing expression float a = 7/4*9/2
		
		float a = 7/4.00f * 9/2.00f;
		System.out.println("Hence, The value of 'a' is " +a);
		
		
		 System.out.println(); // Just for adding extra line before starting new question.

		// 2.Write a Java Program to encrypt a grade by 8 to it. Decrypt it to show the correct Grade.
		
		 char grade = 'C';
		 grade += 8;
		 
		 System.out.println("Encrypted Grade is " +grade);
		 System.out.println("Decrypting The Grade");
		 grade -= 8;
		 System.out.println("Hence Decrypted grade is " + grade);
		 
		
		 System.out.println(); // Just for adding extra line before starting new question.
		 
		 

		 // 3. Use Comparison Operators to find out Whether a given No. is Greater then the User Entered Number?
		 
		 
	  Scanner sc = new Scanner(System.in);
	  
	  long given = 9665547;
	  System.out.println("The Given Number is " + given);
	  
	  System.out.println("Enter your desired number");
	  long User_Entered = sc.nextLong();
	  
	  boolean result = given>User_Entered;
	  System.out.println("Is the Given number " + given + " " + "Greater then the user entered number " + User_Entered +"? ");
	  System.out.println(result);
		
	  System.out.println(); // Just for adding extra line before starting new question.
	  
	  
	  // 4. Write the following expression in Java Program: (v2 - u2)/2h5?
	  
	  
		int v = 57;
		int u = 12;
		
		int h = 20;
		
		float r = (v*v - u*u)/(2*h*5);
		System.out.println("Hence, the Output is " + r);
		
		System.out.println(); // Just for adding extra line before starting new question.
		
		
		
		// 5. Find the value of the following program : 
		/* int x = 7
		   int y = 7*49/7 + 35/7
		   find the value of 'y'?
		   */
			
		
		 int x = 7;
		 int y = 7*49/7 + 35/7;
		
		System.out.println("Hence, the value of 'y' is " +y);
		
		
	
	}

}
