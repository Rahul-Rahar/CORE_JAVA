package com.CoreJava;
import java.util.Scanner;
public class Ch04_01_Conditionals_If_Else_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// If-else STATEMENTS IN JAVA\
		
		// syntax of an If-Else statement is almost similar in major Programming Languages like C, C++, JavaScript.
		
		
		// The syntax of If-else Statements in Java is:
		
		/* 
		
			int a = value   // Statement
		
		  	if(condition-to-be-checked) {
		           Statements-if-Condition-true;
		           }
		           
		    else{
		           Statements-if-Condition-False:       
		       }
		 */
		
		
		int a = 57;
		int b = 78;
		
		if(a>b) // Condition to be checked is == a>b
		{
			System.out.println(a + " is Greater than " + b);
		}
		
		else   // If the Condition is False than This Output Runs
		{
			System.out.println(a + " is Smaller than " +b);
		}
		
		
		
		// NOTE THAT: 
		//           Else condition is optional. We can run our code without 'Else', 
		//           if there's condition not met and don't have else, ther's no output or error will come on the screen.
		
		
		
		// Another Examples of If-Else Statements:
		
		
		// 1. ENOUGH MONEY OR NOT TO BUY AN UMBRELLA
		
			Scanner sc = new Scanner(System.in);
		
			int Price = 1299;
			System.out.println("Total Price of The Umbrella is " +Price);
		
			System.out.println("Enter Total Money in Your Pocket ");
			int pocketMoney = sc.nextInt();
		
			if (pocketMoney> Price) {
				System.out.println("You have Enough Money to Buy Umbrella!");
			}
		
			else {
				System.out.println("Not enough money to Buy Umbrella!");
			}
		
		
		
		
		
		// 2. WATCHING TV ONLY ON SUNDAY
				Scanner sc2 = new Scanner(System.in);
				
				
				System.out.println("What is the Day Today?");
				String day = sc2.nextLine();
				
				System.out.println("Today is " + day + "!");
				
				String TV_Day = "Sunday";
				
				if (day.equalsIgnoreCase(TV_Day)) {
					System.out.println("Hurray! We can Watch TV today.");
				}
				
				else {
					System.out.println("No! we cannot watch TV today");
				}
				
				
				
				
				
		// 3. EATING JUNK FOOD ON FRIEND'S BIRTHDAY
				
				Scanner sc3 = new Scanner(System.in);
				
				System.out.println("Is it our Friend's Birthday today?");
				String birthday = sc3.nextLine();
				
				if (birthday.equalsIgnoreCase("Yes")) {
					System.out.println("Let's party. Today is our Friend's Birthday! Order Junk Food now.");
				}
				
				else {
					System.out.println("Today is not our Friend's birthday! So, no Junk Food");
				}
		
		
		
		
		// 4. ORDERING MEAL IF OUR FAVOURITE ALOO BHINDI LISTED ON MENU
				Scanner sc4 = new Scanner(System.in);
				
				System.out.println("What is in the Menu Today?");
				String Menu = sc4.nextLine();
				
				String favourite_meal = "Aloo Bhindi";
				
				if (Menu.equalsIgnoreCase(favourite_meal)) {
					System.out.println("Order my Meal now!");
				}
				
				else {
					System.out.println("No, I don't wanna Order anything.");
				}
		
		
		
	}

}
