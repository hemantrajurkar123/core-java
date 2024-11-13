package ExceptionHandling;

public class FinallyDemo {

	//case1: Exception occured, catch block handled ---> finally block will execute
	/*
	public static void main(String[] args) {
		System.out.println("Program Started...");
		int array[] = null;
		try {
			System.out.println(array.length);  // The statement which can cause the exception has to be put in the try block

		} catch (Exception e) {
			System.out.println("Exception handled..");
			System.out.println(e.getMessage());

		}
		finally
		{
			System.out.println("Entered into the finally block...");
		}
		System.out.println("Program ended...");

	}

}
*/
	
	//case2: Exception occured, catch block NOT handled --> finally block will execute

	/*
	public static void main(String[] args) {
	System.out.println("Program Started...");
	int array[] = null;
	try {
		System.out.println(array.length);  // The statement which can cause the exception has to be put in the try block

	} catch (ArithmeticException e) { // We are putting a wrong exception type here so that catch block wont handle it
		System.out.println("Exception handled..");
		System.out.println(e.getMessage());

	}
	finally
	{
		System.out.println("Entered into the finally block...");
	}
	System.out.println("Program ended...");

}

}
*/


	//case3: Exception does not occured, catch block ignored ----> finally block will execute 
/*
public static void main(String[] args) {
	System.out.println("Program Started...");
	int array[] = {1,2,3,5,6,7};
	try {
		System.out.println(array.length);  // The statement which can cause the exception has to be put in the try block

	} catch (Exception e) {
		System.out.println("Exception handled..");
		System.out.println(e.getMessage());

	}
	finally
	{
		System.out.println("Entered into the finally block...");
	}
	System.out.println("Program ended...");

}

}
*/
}
// Finally is an optional block
// Finally block will always execute. Whether the exception is handled or not
// Example, if db connection is opened, we will put it in a try block. If db is not available then catch block will handle the exception. The finally block will close the connection

//There can be 3 cases in which finally can be used
/*finally block
-------------
case1: Exception occured, catch block handled ---> finally block will execute
case2: Exception occured, catch block NOT handled --> finally block will execute
case3: Exception does not occured, catch block ignored ----> finally block will execute */


