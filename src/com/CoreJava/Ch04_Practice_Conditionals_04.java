package com.CoreJava;
import java.util.Scanner;

public class Ch04_Practice_Conditionals_02 {

    public static void main(String[] args) {
        // This program determines the day of the week based on a number input by the user.
        // The mapping is as follows: 1 for Monday, 2 for Tuesday, and so on up to 7 for Sunday.

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter the day of the week as a number (1 for Monday, 2 for Tuesday, etc.)"); // Prompt the user to enter a number for the day
        int day = sc.nextInt(); // Read the integer input from the user

        // Use a switch statement to determine the day of the week based on the user's input
        switch (day) {
            case 1:
                System.out.println("The day is Monday"); // Output if the user enters 1
                break;

            case 2:
                System.out.println("The day is Tuesday"); // Output if the user enters 2
                break;

            case 3:
                System.out.println("The day is Wednesday"); // Output if the user enters 3
                break;

            case 4:
                System.out.println("The day is Thursday"); // Output if the user enters 4
                break;

            case 5:
                System.out.println("The day is Friday"); // Output if the user enters 5
                break;

            case 6:
                System.out.println("The day is Saturday"); // Output if the user enters 6
                break;

            case 7:
                System.out.println("The day is Sunday"); // Output if the user enters 7
                break;

            default:
                System.out.println("Please enter a valid number for the day of the week (1-7)."); // Output if the user enters a number outside 1-7
                break;
        }
    }
}

