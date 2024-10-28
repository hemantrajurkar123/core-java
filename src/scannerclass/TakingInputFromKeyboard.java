package scannerclass;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		System.out.println("Please enter the number");
//		int a = s.nextInt(); // to take the int number
//		System.out.println("Your entered number is :" + a);
//		
//		// Decimal number
//		System.out.println("Please enter the decimal number");
//		double d=s.nextDouble();
//		System.out.println("Decimal number is "+d);

		// String
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Your name is " + name);

	}

}

// Scanner class is the predefined class present in the java which is used to take the input from the keyboard
// We have to create the object of the Scanner class and use that object to perform operations with predefined methods
// For example to take the int input from the keyboard we can use s.nextInt() method and store the input value in the variable a