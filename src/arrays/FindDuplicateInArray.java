package arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int array[]= {10,20,10,30,20,10};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("The duplicate number is  "+array[i]);
					break;
				}
			}
		}

	}

}


// Find a duplicate number in an array
// For this,we need to compare array numbers with each other
// The index i will hold the values of the entire array. The index j will hold the value from the i+1 index of an array.

/*
 * In this code, the inner loop (for (int j = i + 1; j < array.length; j++))
 * will continue to iterate over j until one of two things happens:
 * 
 * 1. It finds a duplicate and encounters the break statement. 
 * If a duplicate is
 * found (array[i] == array[j]), the break statement immediately stops the inner
 * loop and returns control to the next iteration of the outer loop (i++). 
 * 
 * 2.It completes all iterations without finding a duplicate. If no duplicate is
 * found for the current i, the inner loop will reach j = array.length, exit
 * naturally, and control will return to the outer loop. In summary:
 * 
 * The inner loop does not automatically return to the outer loop on each
 * iteration; it will either continue iterating through all values of j or break
 * if a duplicate is found. Each iteration of the outer loop initiates a new
 * inner loop with j = i + 1.
 */
