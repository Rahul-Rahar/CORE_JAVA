package com.CoreJava;
import java.util.Scanner;

public class Ch01_Practice_km_to_miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// WRITE A JAVA PROGRAM TO CONVERT KILOMETERS INTO MILES
		
		Scanner sc = new Scanner(System.in);
		
		float kilometer1 = 00.62f;
		System.out.println("Converting 1KM into MILES is " + kilometer1);
		
		
		System.out.println("Enter total Kilometers to Convert into Miles");
		float kms = sc.nextFloat();
		
		
		float kms_to_miles = kms * kilometer1;
		System.out.println("Total Miles in " + kms + " " +"Kilometers is :- " + kms_to_miles + "Miles");
				

	}

}
