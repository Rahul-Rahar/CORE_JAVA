package com.CoreJava;

public class Ch03_02_STRINGS_print_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Methods to Print output in Java
		// There are many methods to print output in Java
		
		
		// 1. System.out.print();
		
		System.out.print("Hello Guys! ");
		System.out.print("My name is Rahul"); // This method does not create new Line at the End of every Result Printed. It will take same Line to print out next outcome.
		
		
		// 2. System.out.println();
		
		System.out.println();
		System.out.println("Hello Guys!");
		System.out.println("My name is Rahul"); // This method prints a New Line every time after print is executed.
		
		
		// 3. System.out.printf(); 
		//    printf() Method is helpful for those who are from C Language background and can easily understand some Programming of Java.
		
		
		int a = 78;
		float b = 98.98772f;
		
		System.out.printf("The Value of 'a' is %d and the Value of 'b' is %f" , a, b); // The %d or %f is called Format Specifier.
		                                                                               // 1. %d = int , 2. %c = char , 3. %S = String , 4. %f = float.
		
		System.out.println();
		System.out.printf("The Value of 'a' is %d and the Value of 'b' is %.2f" , a, b); // We entered .2f instead of %f only , now it will show Value of 'b' only for 2 Decimals.
		
		
		System.out.println();
		System.out.printf("The Value of 'a' is %d and the Value of 'b' is %8.2f" , a, b); // Here We entered %8.2f, now it will give space of 8 including 'b'.
		
		
		System.out.println();
		// 4. System.out.format();
		
		// As same as System.out.printf();
	
		System.out.format("The Value of 'a' is %d and the Value of 'b' is %f" , a, b);
	}

}
