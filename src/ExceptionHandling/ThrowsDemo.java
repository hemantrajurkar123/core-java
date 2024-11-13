package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Program started...");
//		try {
//			FileInputStream fs=new FileInputStream("C://test.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		FileInputStream fs = new FileInputStream("D://test.txt");
		System.out.println(fs.read());
		System.out.println("Program ended...");
	}

}

// In checked exceptions Java identifies the exception 
// In this case we have 2 options to handle it
// Either we can use try catch, or use the Throws statement
// Once you will hover the cursor on the statement which can cause exception, java will automatically give you an option to add the throw option
// Once clicked, it will automatically add the Throws statement