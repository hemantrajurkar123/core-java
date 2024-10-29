package arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int array[] = { 10, 20, 50, 40, 30 };
		for (int i = array.length - 1; i > -1; i--) {
			System.out.println(array[i]);
			}
		}
	}


// To reverse the given array, we need to initialize the index from the last index of an array. i.e. array.length-1
// IMP: We can not use enhanced for loop for this because enhanced for loop reads the value of an array from start. Not from the end.
// It is the default behavior of enhanced for loop

//Execution Steps
//Initialization:
//
//int i = array.length - 1; initializes i to the last index of the array.
//For array, which has 5 elements (indices 0 to 4), array.length is 5, so i starts at 4.
//Condition Check:
//
//The loop continues as long as the condition i > -1 is true. This means the loop will run until i is -1.
//Loop Execution:
//
//The loop body executes, which prints the element at the current index i.
//Decrement:
//
//After each iteration, i-- decrements i by 1.
//Iteration Details
//Let's go through each iteration:
//
//Iteration 1:
//
//Value of i: 4
//Element Printed: array[4] which is 30
//Next i: 3
//Iteration 2:
//
//Value of i: 3
//Element Printed: array[3] which is 40
//Next i: 2
//Iteration 3:
//
//Value of i: 2
//Element Printed: array[2] which is 50
//Next i: 1
//Iteration 4:
//
//Value of i: 1
//Element Printed: array[1] which is 20
//Next i: 0
//Iteration 5:
//
//Value of i: 0
//Element Printed: array[0] which is 10
//Next i: -1
//Iteration 6:
//
//Value of i: -1
//The loop condition i > -1 is now false, so the loop exits.