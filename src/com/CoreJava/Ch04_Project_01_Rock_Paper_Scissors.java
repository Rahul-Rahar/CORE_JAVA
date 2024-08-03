package com.CoreJava;
import java.util.Scanner;
import java.util.Random;
public class Ch04_Project_01_Rock_Paper_Scissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Building a Rock, Paper and Scissor game with User vs Computer
		
		// Print the introduction message for the game
        System.out.println("Let's play Rock, Paper, Scissor game!");

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a Random object to generate computer's choice
        Random rm = new Random();

        // Prompt the user to enter their choice
        System.out.println("Enter 0 for Rock, 1 for Paper & 2 for Scissor");

        // Read the user's input
        int play_game = sc.nextInt();

        // Generate a random number for computer's choice (0 = Rock, 1 = Paper, 2 = Scissor)
        int random = rm.nextInt(3);

        // Use a switch statement to handle the user's choice
        switch (play_game) {
            case 0: 
                // User chose Rock
                System.out.println("You Chose Rock");
                
                // Compare user's choice with computer's choice
                if (random == 1) {
                    // Computer chose Paper
                    System.out.println("I Chose Paper");
                    System.out.println("I Win! Better luck next time.");
                } 
                
                else if (random == 2) {
                    // Computer chose Scissor
                    System.out.println("I Chose Scissor");
                    System.out.println("Congrats! You Win. Wanna Play Once More?");
                } 
                
                else if (random == 0) {
                    // Computer chose Rock
                    System.out.println("I Chose Rock");
                    System.out.println("OOPS! Looks like the match is tied. Let's play once again!");
                }
                
                // End of case 0
                break;

            case 1: 
                // User chose Paper
                System.out.println("You Chose Paper");
                
                // Compare user's choice with computer's choice
                if (random == 1) {
                    // Computer chose Paper
                    System.out.println("I Chose Paper");
                    System.out.println("OOPS! Looks like the match is tied. Let's play once again!");
                } 
                
                else if (random == 2) {
                    // Computer chose Scissor
                    System.out.println("I Chose Scissor");
                    System.out.println("I Win! Better luck next time.");
                } 
                
                else if (random == 0) {
                    // Computer chose Rock
                    System.out.println("I Chose Rock");
                    System.out.println("Congrats! You Win. Wanna Play Once More?");
                }
                
                // End of case 1
                break;

            case 2: 
                // User chose Scissor
                System.out.println("You Chose Scissor");
                
                // Compare user's choice with computer's choice
                if (random == 1) {
                    // Computer chose Paper
                    System.out.println("I Chose Paper");
                    System.out.println("Congrats! You Win. Wanna Play Once More?");
                } 
                
                else if (random == 2) {
                    // Computer chose Scissor
                    System.out.println("I Chose Scissor");
                    System.out.println("OOPS! Looks like the match is tied. Let's play once again!");
                } 
                
                else if (random == 0) {
                    // Computer chose Rock
                    System.out.println("I Chose Rock");
                    System.out.println("I Win! Better luck next time.");
                }
                
                // End of case 2
                break;

           default:
        	   System.out.println("Invalid Choice! Please Enter number between 0, 1 and 2.");
        }
		

	}

}
