package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println(a[0][0]); // 100
		System.out.println(a[0][1]); //200
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
				// i represents row and j represents column
				// a[0].length represents the number of columns present at the 0th row. It is a method to retrive the columns present in the two dimensional array
				// You can also use a[1].length in the second for loop as the number of columns will remain the same in the two dimensional array for any row
				// You can also use a[i] if we don't know the number of rows
			}
			// using advanced for loop
			
			for(int arr[]:a) {
				for(int x:arr) {
					System.out.println(x);
				}
			}
			
			// How advanced for loop works?
			// First statement for(int arr[]:a) is a single dimensional array. It will capture the entire first row of the array {100,200}
			// In the next line (int x:arr) the value 100 will be assigned to x. Then value 200 will be assigned to x;
			// After that it will print the values with syso
			// Once the first row is completed, it will again go to the next row {300,400} and the process will continue

		}
	}

}

// Two dimensional arrays will have rows as well as columns
// The first square bracket represents the row and second square bracket represents the column
// To retrieve the value of array we have to use row and column indexes
// To print the complete array, we need two for loops. One for iterating and incrementing rows and other for incrementing columns