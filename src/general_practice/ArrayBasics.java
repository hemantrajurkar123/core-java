package general_practice;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 40, 30, 100, 80 };

		System.out.println(Arrays.toString(numbers)); // basically to print the complete array, you have to use
														// Arrays.toString() method
	// Arrays.toString() method does not iterate through array, for that you have to use for loop or enhanced for loop
		
//		for(int i=0;i<numbers.length;i++) {  // i is the index of the array. numbers[i] is the element at that index in the array
//			System.out.println(numbers[i]);
//		}
//		
//		numbers[0]=400; // Adding the number at the 0th index
//		for(int x:numbers) {
//			System.out.println(x);
//		}
//		
		//Multi Dimensional Array:
		
		int multiarray[][]= {{1,2,3},{5,6,7}};
		for(int i=0;i<multiarray.length;i++) {
			for(int j=0;j<multiarray[i].length;j++) {
				System.out.println(multiarray[i][j]);
			}
		}
		
		System.out.println(Arrays.deepToString(multiarray)); // use Arrays.deepToString() to print the multi dimensional array

	}
	

}
