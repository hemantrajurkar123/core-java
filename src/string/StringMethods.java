package string;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s.length());
		String s1 = "Welcome";
		String s2 = "To Java";
		System.out.println(s1 + " " + s2);

		String s4 = "   Welcome   ";
		System.out.println("Befor triming " + s4.length()); // 13
		String s5 = s4.trim(); // Trims the left and right spaces of the string. Not in between spaces

		System.out.println("After triming " + s5.length()); // 7

		// charAt() method returns a character from a string based on index
		// Index starts from 0

		s = "Welcome";
		System.out.println(s.charAt(3)); // c

		// contains() returns true/false
		// It checks if the string is a part of the main string

		System.out.println(s.contains("Wel")); // true
		System.out.println(s.contains("Come")); // false. contains is case sensitive

		// equals(), equalsIgnoreCase()- compares two strings
		// returns true/false

		s1 = "welcome";
		s2 = "welcome";

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals("Welcome")); // false. Case sensitive
		System.out.println(s1.equalsIgnoreCase("Welcome")); // true. case ignored

		// replace()- replaces the single character or sequence of characters in the
		// string

		s1 = "Welcome to java selenium";
		System.out.println(s1.replace('e', 'X')); // WXlcomX to java sXlXnium
		System.out.println(s1.replace("selenium", "c#")); // Welcome to java c#

		// substring()- extract substring from the main string
		// It will take 2 parameters. Starting index and ending index. Starting Index
		// starts from 0, ending index starts from 1

		s = "welcome";
		System.out.println(s.substring(2,5));// lco
		System.out.println(s.substring(1,3));// el
		
		// toUpperCase(), toLowerCase()- to change the case
		
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
		
		// split() - split the string in parts based on the delimeter (ex: @)
		
		// Example 1:
		s="abc@xyz";
		String a[]=s.split("@"); 
		System.out.println(a[0]);
		System.out.println(a[1]);
		// split() method splits the string and returns two strings in the above example
		// Therefore, to store these two strings we have to use an array of String type
				
        //Example 2:
		s="abc,123@xyz"; // requirement: split this into 3 different parts
		String a1[]=s.split(","); // [abc,abc@xyz]
		System.out.println(a1[0]);// abc
		System.out.println(a1[1]); //xyz
		String a2[]=a1[1].split("@"); //[123,xyz]
		System.out.println(a2[0]); // 123
		System.out.println(a2[1]); //xyz


  
	}

}

// String is a predefined class in java. Once we create the object of the class, ex, String s, we will get methods to do operation on the object.
// String is not a primitive data type.