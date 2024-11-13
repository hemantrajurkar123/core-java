package ExceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Program Started...");
		int array[] = null;
		try {
			System.out.println(array.length);  // The statement which can cause the exception has to be put in the try block

		} catch (Exception e) {
			System.out.println("Exception handled..");
			System.out.println(e.getMessage());

		}
		System.out.println("Program ended...");

	}

}


/* 
  Types of exceptions
 
-------
1) Checked exceptions
The exceptions which are identified by java compiler.
	Ex: InteruptedException
     		FileNotFound
		IOException etc...

2) Un-checked exceptions

The exceptions which are not identified by java compiler.
Ex:
		ArithmeticException
		NullPointerException
		ArrayIndexOutOfBoundsException etc...
			etc...
 */

