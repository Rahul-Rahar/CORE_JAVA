package com.CoreJava;
import java.util.Scanner;

public class PracticeCh1_06_02_Greet_Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your Name?");
		String name = sc.nextLine();
		
		System.out.println("Hello " + name + ", " + "have a good day!");
	}

}
