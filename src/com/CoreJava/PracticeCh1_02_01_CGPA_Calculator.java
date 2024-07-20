package com.CoreJava;
import java.util.Scanner;

public class PracticeCh1_02_01_CGPA_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WRITE A PROGRAM TO CALCULATE CGPA USING MARKS OF THREE SUBJECTS (OUT OF 100).
		
		System.out.println("CGPA CALCULATOR");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Maximum Marks Can Be Obtained in Subject 1");
		float sub1 = sc.nextFloat();
		
		System.out.println("Total Marks Obtained in Subject 1");
		float Obtained_sub1 = sc.nextFloat();
		
		
		System.out.println("Maximum Marks Can Be Obtained in Subject 2");
		float sub2 = sc.nextFloat();
		
		System.out.println("Total Marks Obtained in Subject 2");
		float Obtained_sub2 = sc.nextFloat();
		
		
		
		System.out.println("Maximum Marks Can Be Obtained in Subject 3");
		float sub3 = sc.nextFloat();
		
		System.out.println("Total Marks Obtained in Subject 3");
		float Obtained_sub3 = sc.nextFloat();
		
		
		
		
		float Total_Max_Marks = sub1 + sub2 + sub3;
		System.out.println("Total of Maximum marks can be obtained in Examination :- " + Total_Max_Marks);
		
		
		
		float Total_Obtained_Marks = Obtained_sub1 + Obtained_sub2 + Obtained_sub3;
		System.out.println("Total Marks Obtained in Examination :- " + Total_Obtained_Marks);
		
		
		
		float Total_Percentage = (Total_Obtained_Marks / Total_Max_Marks) *100;
		System.out.println("Total Percentage Obtained by Student in Examination :- " + Total_Percentage);
		
		
		
		float CGPA = Total_Percentage / 10;
		System.out.println("CGPA achieved by Student in Examination :- " + CGPA);
		
		
		
		

	}

}
