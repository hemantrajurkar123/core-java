package data_types;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; //declaration
		a=100; // assignment
		System.out.println("The value of a is "+a);
		
		int b=200; //declaration+assignment
		System.out.println("The value of b is  "+b);
		
		// For multiple variables
		int c,d,e;  // declaring multiple variables
		c=300;
		d=400;
		e=500;
		
		// defining multiple variables in a single line
		int f=300,g=400,h=500;
		System.out.println(f+g+h); // it will print the addition
		System.out.println(f+" "+g+" "+h); // it will print the respective values of the variable
		
		// data types
		
		// primitive data types- Those which are predefined there are 8 primitive data type
		// numeric data types----> byte, short, int, long
		// float data types----> float, double
		// boolean and char
		
		// These data types are provided because every data type has range. If we define int data type with the value of say x=123, it will be a waste of memory
		// We can not directly print the value of any variable without declaring it with some value
		
		byte k = 0;
		System.out.println("byte x"+k);
		
		boolean x=true;
		System.out.println("boolean value "+x);
		
		// Non primitive data types--> Not predefined in java except Strings. Others are created by developers
		// String, Arrays, Classes, Interfaces are non primitive data types
		// A primitive type always has a value, while non-primitive types can be null.
		
		// The char data type holds the single char. We have to use the single quote for its value
		char grade='B';
		
		// We have to use double quote to define the string value as string contains multiple characters
		String s="String";
		}

}
