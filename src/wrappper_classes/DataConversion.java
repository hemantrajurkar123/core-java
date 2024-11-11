package wrappper_classes;

public class DataConversion {

	public static void main(String[] args) {
		
/*-----------------------------------Converting the String type data into int,double,char, boolean------------------------------------------------ */		


		// Scenario1: Converting the string to int
		/*
		String s1="100";
		String s2="200";
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2); // we need to use the target data type to convert. ex: we need to convert the String data type to Integer data type. So to convert we have to use Integer.method_name()
		System.out.println(sum);
		*/
		
		// Scenario 2: Converting the string to double
		/*
		String s1="10.5";
		String s2="20.5";
		
		double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
		System.out.println(sum);
		
		*/
		
		// Scenario 3: Converting the string to boolean
		/*
		String s1="true";
		boolean b= Boolean.getBoolean(s1);
		System.out.println(b);
		// In the case of String to boolean, if the String value contains true or false, then only it will get converted to boolean.
		*/
		
		// Scenario 4: Converting the string to char
		// can not convert. Not possible
		
//		String s1="W";

/*-----------------------------------Converting the int,double,char, boolean type data into String ------------------------------------------------ */		

		// Scenario 1
		// Converting int value to String
		
		int x=100;
		String s1=String.valueOf(x);
		System.out.println(s1);
		
		
		// Scenario 2
		// Converting double value to String
		double d=10.5;
		String s2= String.valueOf(d);
		System.out.println(s2);
		
		// Scenario 3
		// Converting boolean to String
		boolean b=true;
		String s3=String.valueOf(b);
		System.out.println(s3);
		
		// Scenario 4
		// Converting char to string
		
		char c='C';
		String s4=String.valueOf(c);
		System.out.println(s4);
		
	}

}

// The idea here is to convert String data type to -->int, double, boolean, char
// Also we can convert the int, double, boolean, char --->String
// From String to other primitive data conversion use parseInt(), parseDouble() etc
// From primitive to String use valueOf()