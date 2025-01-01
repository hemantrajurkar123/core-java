package array_list;

import java.util.ArrayList;

public class StringArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // If the arraylist contains homogeneous data, you have to specify it with data type containing in the angle bracket
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Volvo");
		cars.add("Volkswagon");
		cars.add("Mercededs");
		
		System.out.println("Cars arraylist : "+cars);
		cars.remove(3);
		System.out.println("Cars arraylist after removing an element : "+cars);

	}

}
