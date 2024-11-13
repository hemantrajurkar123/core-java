package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		mylist.add(10);
		mylist.add("Welcome");
		mylist.add(50.6);
		mylist.add('A');
		mylist.add(true);
		mylist.add(10);
		mylist.add(null);

		// Prints the full arraylist
		System.out.println("ArrayList: " + mylist);

		// gets the size of an arraylist
		System.out.println("ArrayList size: " + mylist.size());

		// gets the element from the specific index
		System.out.println("ArrayList fetch from index 5: " + mylist.get(5));

		// removing the element from the arraylist from the specific index
		mylist.remove(5);

		// Prints the full arraylist after removing the element
		System.out.println("ArrayList after removing the element: " + mylist);
		
		// Add an element in between the arraylist		
		mylist.add(2,"Hello"); // adds the value "Hello" at the index 2. The method takes 2 parameters. First is index and second is the value. Rest of the arraylist elements will be shifted to their next index
		System.out.println("ArrayList after adding the element: " + mylist);

		// Modyfying the value at index
		mylist.set(2, "Java"); // set method takes 2 parameters. first is index, second is value. Value at that index will be set to the value provided in the set method
		System.out.println("ArrayList after modifying the element: " + mylist);

 
		System.out.println("ArrayList content: ");

		// looping the arraylist using for loop

		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i)); // printing the value of arraylist at each index
		}
		
		// looping the arraylist using for each loop / enhanced for loop
		
		for(Object x:mylist) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Iterate the arraylist using iterator method which is available only for Java collections");

		
		// looping the arraylist using the iterator method. It is specifically available for the collections
		Iterator it= mylist.iterator(); // Returns the iterator of type Iterator 
		while(it.hasNext()) //hasNext returns true if the iterator has more elememts
		{
			System.out.println(it.next()); //next returns the next element in the iteration
		}
		
		//Check if arraylist is empty
		Boolean isempty=mylist.isEmpty(); //returns false
		System.out.println(isempty); 
		
		// Remove all the elements from the arraylist
//		mylist.clear();
	}

}

// ArrayList is a class. It is present in java.util package
// It is an extension of the List interface which is extended from the Collections interface
// So the hierarchy is Collections(I)-->List(I)-->ArrayList(C)
// ArrayList is used to store objects. These objects can be of the same type or different types
// ArrayList follows indexing. The order of the elements inserted is maintained
// null and duplicate objects are also allowed in the ArrayList