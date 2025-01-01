package hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); //we have to define the data type of the key-value while creating the hashmap object
		hm.put(1, "Sachin");
		hm.put(2, "Virat");
		hm.put(3, "Rohit");
		hm.put(4, "Surya");
		hm.put(5, "Kartik");
		hm.put(5, "Jaspreet"); // Duplicate keys are not allowed. If you add the duplicate keys, it will override the previous key value of the same key
							   // It was 5=Kartik before, now it is 5=Jaspreet
		System.out.println(hm);
		System.out.println("Size of hashmap :"+hm.size());
		
		//Removing the pair
		hm.remove(1);
		System.out.println("After removing the pair"+hm);
		
		//access the value of the key
		System.out.println(hm.get(2)); // we have to provide the key
		
		//get all the keys from the hashmap
		System.out.println(hm.keySet()); // returns only keys, not values
		
		//get all the values from the hashmap
		System.out.println(hm.values());
		
		//get all key-values
		System.out.println(hm.entrySet());
		
		// Looping through the hashmap
		// Normal for loop is not possible because hashmap does not preserve indexing
		// We can use advanced for loop
		
		for(int x:hm.keySet()) {
			System.out.println(x+"  "+hm.get(x));
		}
		
		// Explanation:
		// We are storing the keyset returned by KeySet() method into x in each iteration
		// Once the keys are mapped, we can get the value from that perticular key by using the get() method
		


	}

}

/*
HashMap - a class implemented Map interface
--------------
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved(Index not followed)
*/