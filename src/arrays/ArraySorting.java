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

//Suppose we’re swapping array[i] (50) and array[j] (30).
//
//Store the Value of array[i] in temp:
//
//int temp = array[i];
//temp now holds 50, which is the original value of array[i].
//Assign the Value of array[j] to array[i]:
//
//array[i] = array[j];
//This changes array[i] to 30, so now array[i] has the value of array[j].
//At this point:
//
//array[i] is 30 (value of array[j]).
//array[j] is still 30.
//temp is 50 (original value of array[i]).
//Assign temp (the Original array[i] Value) to array[j]:
//
//array[j] = temp;
//This sets array[j] to 50, the original value of array[i].
//Now the swap is complete, with array[i] holding 30 and array[j] holding 50.
//
//Why array[j] = temp; Is Essential
//Without array[j] = temp;, you would lose the original value of array[i] (50) once array[i] is assigned the value of array[j] (30). This would leave both array[i] and array[j] holding the same value (30), making the swap incomplete.
//
//In summary, array[j] = temp; restores the original value of array[i] into array[j], completing the swap and ensuring both values are exchanged correctly.