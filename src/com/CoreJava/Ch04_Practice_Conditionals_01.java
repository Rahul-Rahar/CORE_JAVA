package com.CoreJava;
import java.util.Scanner; // Import Scanner for user input

public class Ch04_Practice_Conditionals_01 {

    public static void main(String[] args) {
        /* Program to determine if a student passes or fails based on marks.
           The criteria are a total of 40% overall and at least 33% in each subject.
           Assume 3 subjects and take marks as input from the user.
 		*/
    	
    	
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter the maximum marks possible in Subject 1"); // Prompt for maximum marks in Subject 1
        int Sub1 = sc.nextInt();

        System.out.println("Enter the marks obtained in Subject 1"); // Prompt for obtained marks in Subject 1
        int Subject1 = sc.nextInt();

        System.out.println("Enter the maximum marks possible in Subject 2"); // Prompt for maximum marks in Subject 2
        int Sub2 = sc.nextInt();

        System.out.println("Enter the marks obtained in Subject 2"); // Prompt for obtained marks in Subject 2
        int Subject2 = sc.nextInt();

        System.out.println("Enter the maximum marks possible in Subject 3"); // Prompt for maximum marks in Subject 3
        int Sub3 = sc.nextInt();

        System.out.println("Enter the marks obtained in Subject 3"); // Prompt for obtained marks in Subject 3
        int Subject3 = sc.nextInt();

        float Per_Sub1 = (float) Subject1 / Sub1 * 100; // Calculate the percentage for Subject 1
        float Per_Sub2 = (float) Subject2 / Sub2 * 100; // Calculate the percentage for Subject 2
        float Per_Sub3 = (float) Subject3 / Sub3 * 100; // Calculate the percentage for Subject 3

        boolean condition_check = (Per_Sub1 >= 33) && (Per_Sub2 >= 33) && (Per_Sub3 >= 33); // Check if the student has at least 33% in each subject

        if (condition_check) { // If the student has at least 33% in each subject
            int Max_Marks = Sub1 + Sub2 + Sub3;
            System.out.println("Total maximum marks in the examination: " + Max_Marks); // Display the total maximum marks possible

            int Obtained_Marks = Subject1 + Subject2 + Subject3;
            System.out.println("Total marks obtained in the examination: " + Obtained_Marks); // Display the total marks obtained

            float Percentage = (Per_Sub1 + Per_Sub2 + Per_Sub3) / 3;
            System.out.println("Total percentage in the examination: " + Percentage); // Display the overall percentage

            boolean Percentage_Check = Percentage >= 40; // Check if the overall percentage is at least 40%

            	if (Percentage_Check) { // If the student has at least 40% overall
                System.out.println("Congratulations! You passed the examination with a total of " + Percentage + "%"); // Output if the student passes
            } 
            
            	else { // If the student has less than 40% overall
                System.out.println("Sorry! You failed the examination. You need at least 40% to pass."); // Output if the student fails due to low overall percentage
            }
        } // 'if' condition ended here
        
        
        else { // If the student does not have at least 33% in each subject
            System.out.println("Sorry, you failed! You need at least 33% in each subject and a minimum of 40% overall to pass."); // Output if the student fails due to low marks in individual subjects
        }
    }
}
