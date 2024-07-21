package com.CoreJava;
import java.util.Scanner;

public class Ch01_Practice_04_Integer_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WRITE A JAVA PROGRAM TO DETECT WHETHER A NUMBER ENTERED BY THE USER US INTEGER OR NOT.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Integer Number");
		boolean num = sc.hasNextInt();
		
		System.out.println("Is the Entered Number is an Integer?");
		System.out.println(num);

	}

}
