package scannerclass;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = s.nextInt();
		System.out.println("Enter the second number");
		int num2 = s.nextInt();
		System.out.println("The sum of numbers is " + (num1 + num2));

	}

}
