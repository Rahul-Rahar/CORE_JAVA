package com.CoreJava;
import java.util.Scanner;

public class PracticeCh1_05_03_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WRITE A PROGRAM TO SUM THREE NUMBERS IN JAVA
		
		int num1 = 46;
		int num2 = 3828;
		int num3 = 2783;
		
		int sum = num1 +num2 +num3;
		
		System.out.println("The Sum of Three Numbers are " +sum);
		
		// Adding 3 Numbers through User Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		long numb1 = sc.nextLong();
		
		System.out.println("Enter the Second Number");
		long numb2 = sc.nextLong();
		
		System.out.println("Enter the Third Number");
		long numb3 = sc.nextLong();
		
		long sum1 = numb1 + numb2 + numb3;
		
		System.out.println("The Sum of Three Numbers is " +sum1);
		
	}

}
