package com.CoreJava;

import java.util.Scanner;

public class Ch04_Practice_Conditionals_06 {

    public static void main(String[] args) {
        // Main method to execute the program
        
        // Write a Java program to find out the type of the website from the URL:
        /*
         * .com --> Commercial Website
         * .org --> Organisational Website
         * .in  --> Indian Website
         */
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.println("Enter Website to check its type: ");
        String website = sc.nextLine(); // Read the website URL input by the user
        
        // Check the domain type by the website's ending
        if (website.endsWith(".com")) {
            // If the URL ends with .com, it's a commercial website
            System.out.println("This is a Commercial domain Website.");
        } 
        
        else if (website.endsWith(".org")) {
            // If the URL ends with .org, it's an organizational website
            System.out.println("This is an Organisational Domain Website.");
        } 
        
        else if (website.endsWith(".in")) {
            // If the URL ends with .in, it's an Indian website
            System.out.println("This is an Indian Domain Website.");
        } 
        
        else {
            // If the URL doesn't match any of the known types
            System.out.println("Unknown domain type.");
        }

    }
}
