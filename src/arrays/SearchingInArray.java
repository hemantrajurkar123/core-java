package arrays;

import java.util.Scanner;

public class SearchingInArray {

	public static void main(String[] args) {
		int a[] = { 3, 5, 6, 8, 23, 45, 76 };
//		int number=76;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==number) {
//				System.out.println("The number "+number+" is present in the array at index "+i);
//			}
//			else {
//				System.out.println("The number provided is not present in the array");

//			}
//		}

		// Taking the input from user
		System.out.println("Please enter the number to search in an array");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean status = false;
		for (int i = 0; i < a.length; i++) {
			if (num==a[i]) {
				System.out.println("The number " + num + " is present in the array at index " + i);
				status = true;
				break;
			}
			}
		if (status == false) {
			System.out.println("The number is not present in the array");
		}
	}

}


// This program is for searching an number inside the array. 
// For searching an array and match the number which is provided, first you have to iterate the array, and then check every number with the number to search
// Once you have iterated the number with for loop, you have to check the if condition. If number given matches with array[i]
// array[i] is the number specified at the index i of the array. i.e the 'value' which is present at the index i

// First program is straightforward. In the second program we are taking the input value from the user using the scanner class
// In the second program, we can not use else statement. Because, if we use else, for every not found value, it will print the 'Number not present' as the loop will execute else statement every time if value is not found
// For this we can use a flag. It is nothing but the boolean value. Once the number searched is found, we can make the boolean status as true. 
// The flag is false by default. If the flag remains false, i.e. if number is not found, it will print the number is not found
// We have to use the break statement for breaking the loop when the number is found. If we do not, it will again go to the for loop for checking the further numbers in the array.
// This is the good example of using for loop, if condition, break statement and using boolean flag.