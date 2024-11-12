package wrappper_classes;

public class WrapperClassesDemo {

	public static void main(String[] args) {

		// Following are all primitive data types
		int i = 10;
		double d = 20.5;
		char c = 'C';
		boolean b = true;

		// Now to convert these primitive types into the object types, we can use wrapper classes
		// Wrapper classes are available for each primitive data types
		// There are 8 wrapper classes available: Byte, Short, Integer, Long,Float, Double, Character, Boolean
		// Wrapper classes are have first letter as uppercase. ex. Integer, Double, Char
		// To make the primitive data type the object type simply assign the primitive data type to the Wrapper class variable
		// Ex. Integer iobj=i;

		// Converting primitive data types to object types is called as Autoboxing

		Integer iobj = i; // Using 'Integer' wrapper class, we have assigned the value of primitive
							// variable (int) i to the variable 'iobj' of type 'Integer' wrapper class. Now, the 'iobj' is integer type object
		Double dobj = d;    // dobj is Double type object now
		Character cobj = c; // cobj is Character type object now
		Boolean bobj = b;   // bobj is Boolean type object now
		System.out.println(iobj);  
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		// Object type variables will have predefined methods available to use with the . notation. ex: iobj.equals()
		
		// Converting the Object type of data into the primitive data is called as unboxing
		
		int intval=iobj;  // converted the object value to the primitive int value
		double doubleval=dobj;
		char charval=cobj;
		boolean boolval=bobj;
		
		System.out.println(intval);
		System.out.println(doubleval);
		System.out.println(charval);
		System.out.println(boolval);
		
	}

}

// Wrapper classes are special type of classes that are used to convert primitive type data into the object type of data and object type data to primitive type of data
// Java collections can not hold the primitive type of data. Collections can store only objects

//When to use primitive variables and when to use object type variables?
//1. If you are using the java collections, use object type variables
//2. If you want to use the methods of objects, use object type variables
//3. Else use primitive type of variables
