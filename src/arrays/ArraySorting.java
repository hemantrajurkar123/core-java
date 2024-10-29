package arrays;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int array[] = { 10, 20, 50, 40, 30 };
		System.out.println("Before sorting " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("After Sorting  " + Arrays.toString(array));

	}

}
