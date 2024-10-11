package looping;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 10;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		// The above program will not generate any output as it will check the condition
		// first.
		// Is 10<5? It is false. So it will come out of the loop, and nothing will be
		// printed in the console.
		// But it is different in case of do while loop. For example

		do {
			System.out.println(i); //10
			i++;
		} while (i <= 5);
	}
        // The output is 10 because it will first go the syso statement, prints the value 10.
		// Then it will increase the value to 11, and then it will check the condition. Is 10<=5?
		// It is false, so it will come out of the loop
}

// In while loop, first the condition will be checked and then the statements will be executed.
// In do while, first statements will be executed and then condition will be checked