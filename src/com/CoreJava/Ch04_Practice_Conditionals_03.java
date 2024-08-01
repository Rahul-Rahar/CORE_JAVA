package com.CoreJava;
import java.util.Scanner;

public class Ch04_Practice_Conditionals_03 {

    public static void main(String[] args) {
        // Program to calculate the income tax paid by an employee based on their annual income.
        // Tax slabs are as follows:
        // Income Slab                Tax Rate
        // 2.5L - 5.0L                5%
        // 5.0L - 10.0L               10%
        // Above 10.0L                30%
        // Note: There is no tax on income below 2.5L.

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Please enter your annual income:"); // Prompt the user to enter annual income
        int Income = sc.nextInt(); // Read the income input from the user

        // Output the entered annual income
        System.out.println("Annual income of the employee is: " + Income);

        // Define the income tax slabs
        String Tax_Slab = "Income Tax Slab";
        String slab1 = "SLAB1 ---> Less Than 2.5 Lakhs         - No TAX";
        String slab2 = "SLAB2 ---> 2.5 Lakhs - 5.0 Lakhs       - 5% TAX";
        String slab3 = "SLAB3 ---> 5.0 Lakhs - 10.0 Lakhs      - 10% TAX";
        String slab4 = "SLAB4 ---> Above 10.0 Lakhs            - 30% TAX";

        // Display the income tax slabs
        System.out.println("INCOME TAX SLAB: \n"  + slab1 + "\n" + slab2 + "\n" + slab3 + "\n" + slab4);

        // Determine the tax based on the income slab
        if (Income <= 250000) { // Income less than or equal to 2.5L
            System.out.println("No tax on annual income less than 2.5 Lakhs. Based on SLAB1.");
        } 
        
        else if (Income < 500000) { // Income between 2.5L and 5.0L
            float tax = Income * 5 / 100; // Calculate 5% tax
            System.out.println("Total tax paid by employee is " + tax + " based on Income Tax SLAB2.");
        } 
        
        else if (Income < 1000000) { // Income between 5.0L and 10.0L
            float tax = Income * 10 / 100; // Calculate 10% tax
            System.out.println("Total tax paid by employee is " + tax + " based on Income Tax SLAB3.");
        } 
        
        else if (Income >= 1000000) { // Income above 10.0L
            float tax = Income * 30 / 100; // Calculate 30% tax
            System.out.println("Total tax paid by employee is " + tax + " based on Income Tax SLAB4.");
        } 
        
        else { // Invalid input (should not occur with current checks)
            System.out.println("PLEASE ENTER A VALID ANNUAL INCOME!");
        }

    }
}
