package string;

public class StringComparison {

	public static void main(String[] args) {
		
		//case 1
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true

		//case 2
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println(s3 == s4); // false // == is used to compare objects
		System.out.println(s3.equals(s4)); // true //equals is used to compare values
		
		//case 3
		
		String s5="welcome";
		String s6=new String("welcome");
		System.out.println(s5 == s6); //false. Because new created a new object
		System.out.println(s5.equals(s6)); // true. compared values here
		
		// case 4
		String s7="welcome";
		String s8=new String("welcome");
		String s9=s8;
		System.out.println(s8==s9);// true. Because s9 and s8 are pointing to the same object

	}

}

// In this case System.out.println(s3 == s4); //false // == is used to compare objects
// We have initiated the s3 and s4 using String objects. As the == is used to compare the objects, it will return false.
// This is because for s3 and s4 are different objects for == operator. As soon as we use new keyword, a new object will be created
// IMP: While comparing strings always use equals() method. Because it will work every time and it does not have to be dependent on the object comparison

// Remaining topics: StringBuffer, StringBuilder
