package ExceptionHandling;

public class CustomException {

	void checkAge(int age) {
		if (age < 18) {

			throw new ArithmeticException("Access denied. Under 18");
		}
		
		else {
			System.out.println("Access Granted...Welcome");
		}
	}

	public static void main(String[] args) {
		CustomException ce=new CustomException();
		try 
		{
			ce.checkAge(15);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}

	}

}

// We use the throw statement to create a custom error
// The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
