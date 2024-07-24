package com.CoreJava;
import java.util.Scanner;
public class Ch03_01_STRINGS_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// STRINGS :- A String is a sequence of Characters.
		
		String name;
		name = new String("Harry");
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		String name2 = sc.nextLine(); // sc.nextLine() for All entered words and sc.next() for only First word. 
        System.out.println(name2);
	}

}
