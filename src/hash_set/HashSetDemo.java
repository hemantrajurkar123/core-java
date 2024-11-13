package hash_set;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
    HashSet hs=new HashSet();
    hs.add(100);
    hs.add("Welcome"); // it won't get added as hashset will not allow the duplicate data
    hs.add(5.5);
    hs.add('A');
    hs.add(false);
    hs.add(100);
    hs.add(null); //Only 1 null value is allowed
    System.out.println(hs);
    
    // Removing an element from the HasgSet
    hs.remove(null);  //Directly pass the value to remove the element
    System.out.println("HashSet after removing the element :"+hs);
    
    // Inserting an element in the HashSet is not possible as it does not follow indexing
    
    //To access the specific element from the HashSet
    // It is not directly possible. As it does not follow any indexing 
    // But there is a workaround. We can convert HashSet to ArrayList and then we can access the element with the indexing
    
    
    ArrayList al=new ArrayList(hs);
    System.out.println("Converted HashSet to ArrayList: "+al);
	al.get(3); // get the element at the index 3
	
	
	//Looping of HashSet
	// We can not use the normal for method as HashSet does not follow the indexing
	// We can use the advanced for loop
	
	for(Object x:hs) {
		System.out.println(x); 
	}
	
	// Looping HashSet using iterator
	
	Iterator it= hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}

// HashSet also store objects. Primitive data types are not allowed
/*
HashSet   - a class implemented Set interface
---------
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
*/
