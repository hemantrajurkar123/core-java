package data_types;

public class VariablesDemo1 {

	public static void main(String[] args) {
		
		// Primitive data types: Which are already predefined in the Java. There are 8 primitive data types
		// Numeric Data types: byte, int, short,long
		// Float data types: float, double
		// String and char
		byte b=3;
		System.out.println("Byte b is"+b);
		int a=30,c=40,d=50;
		//System.out.println("a="+a,"c="+c,"d="+d);
		//The System.out.println method in Java only takes a single argument, so if you want to print multiple variables, you need to concatenate them into a single string using the + operator. 
		System.out.println("a=" + a + ", c=" + c + ", d=" + d);
		float f=10;
		System.out.println("float f"+f); // output 10.0, int will be converted to float
		String s="Hemant";
		char i='H';
		System.out.println("String : "+s);
		System.out.println("Char : "+i);
	}

}
