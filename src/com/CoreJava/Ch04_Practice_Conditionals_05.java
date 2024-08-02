package com.CoreJava;
import java.util.Scanner;
public class Ch04_Practice_Conditionals_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java Program to find whether a year entered by the user is a Leap Year or not.
		
		 // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.println("Enter the Year: ");
        // Read the year input by the user
        int year = sc.nextInt();

        // Check if the year is a leap year
        
        // Leap year is divisible by 4 but not divisible by 100, or divisible by 400.
        
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // If the conditions are met, it's a leap year
            System.out.println("Hence " + year + " is a leap year");
        } 
        
        else {
            // If the conditions are not met, it's not a leap year
            System.out.println(year + " is not a Leap Year");
        }

	}

}
