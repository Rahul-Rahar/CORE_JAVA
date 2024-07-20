package com.CoreJava;
import java.util.Scanner; // Importing Scanner Class

public class Ch01_04_Simple_CBSE_Percentage_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("CBSE Students Percentage Calculator"); // Project Name
	    
	    Scanner sc = new Scanner(System.in); // System.in means Input through User or Keyboard
	    
	    System.out.println("Enter the Name Of the Student"); // Name of the student
	    String Student_Name = sc.nextLine(); // For Full name of the Student by User Input
	    
	    System.out.println("Enter the Class of the Student"); // Student's Class
	    String Student_Class = sc.nextLine(); // Class of the Student through User Input
	    
	    System.out.println("Enter the Roll NO. of the Student"); // Student's Roll No.
	    long Roll_No = sc.nextLong(); // Roll No. of the Student through User Input
	    
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 1"); // Max marks can be obtained in First Subject
	    float max_marks_in_sub1 = sc.nextFloat();
	    System.out.println("Total Marks Obtained in Subject 1"); // Total Marks Obtained in First Subject
	    float subject1 = sc.nextFloat();
	    
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 2"); // Max Marks
	    float max_marks_in_sub2 = sc.nextFloat(); // User Input
	    System.out.println("Total Marks Obtained in Subject2"); // Total Marks
	    float subject2 = sc.nextFloat(); // User Input
	    
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 3"); // Max Marks
	    float max_marks_in_sub3 = sc.nextFloat(); // User Input
	    System.out.println("Total Marks Obtained in Subject 3"); // Total Marks
	    float subject3 = sc.nextFloat(); // User Input
	    
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 4"); // Max Marks
	    float max_marks_in_sub4 = sc.nextFloat(); // User Input
	    System.out.println("Total Marks Obtained in Subject 4"); // Total Marks
	    float subject4 = sc.nextFloat(); // User Input
	    
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 5 "); // Max Marks
	    float max_marks_in_sub5 = sc.nextFloat(); // User Input
	    System.out.println("Total Marks Obtained in Subject 5 "); // Total Marks
	    float subject5 = sc.nextFloat(); // User Input
	    
	    
	    
	    System.out.println("Maximum Marks Can Be Obtained in Subject 6"); // Max Marks
	    float max_marks_in_sub6 = sc.nextFloat(); // User Input
	    System.out.println("Total Marks Obtained in Subject 6"); // Total Marks
	    float subject6 = sc.nextFloat(); // User Input
	    
	    float Total_Max_Marks = max_marks_in_sub1 + max_marks_in_sub2 + max_marks_in_sub3 + max_marks_in_sub4 + max_marks_in_sub5 + max_marks_in_sub6; // Sum of Total Max. Marks in All subjects
	    System.out.println("Total Maximum Marks Can be Obtained in Examination " +Total_Max_Marks); // Max marks can be Obtained
	    
	    
	    
	    float Marks_Obtained = subject1 + subject2 + subject3 + subject4 + subject5 + subject6; // Sum of Total Marks Obtained in All Subjects
	    System.out.println("Total Marks Obtained by the Student in the Examination in All Subjects are " +Marks_Obtained); // Total Marks Obtained
	    
	    
	    
	    float Total_Percentage_Of_The_Student = (Marks_Obtained / Total_Max_Marks) * 100; // Percentage Calculation
	    System.out.println("Student Information :- " + "Name : " + Student_Name + " "  + "Class : " + Student_Class + " " + "Roll No. : " + Roll_No); // Student Information Data
	    System.out.println("Total Percentage Obtained by the Student in Examination is " +Total_Percentage_Of_The_Student); // Total Percentage Achieved in Examination by the Student
	    

	}

}
