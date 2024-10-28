package arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		
		System.out.println(a.length);
		System.out.println(Arrays.toString(a)); // to print the complete array
		// Normal for loop to retrieve the values of an array using indexes
		// Here i represents the index of an array. It starts from 0 and iterated till the array length is reached. 
		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
		}

		// Enhanced for loop
		for(int x:a) {
			System.out.println(x);
		}
	}

	// In enhanced for loop or for each loop, the value at the array indexes will be assigned to the x
	// Observe that there is a colon after x
	// In each iteration the value of the array indexes will be assigned to x. i.e. x=10, x=20 .. and so on
	

}
