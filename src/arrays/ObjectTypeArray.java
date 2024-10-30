package arrays;

import java.util.Arrays;

public class ObjectTypeArray {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=100;
		a[1]="welcome";
		a[2]=10.5;
		a[3]='A';
		a[4]=true;

		System.out.println(Arrays.toString(a));
		
		// to loop the object type of array, we have to define a variable of object type
		for(Object x:a) {
			System.out.println(x);
		}
		
	}

}

// Arrays store the single type of data. i.e it is a collection of similar type of data.
// If we want to store different types of data in an array, we have to use object type of array.
// Object type of array can hold any type of data
// It is not recommended method to store multiple types of data in an array. For that we use array list.

