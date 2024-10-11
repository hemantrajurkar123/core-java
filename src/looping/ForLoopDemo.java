
// Print the number 1 to 10 using for loop
package looping;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

// The benefit of for loop: initialization, condition and increment/decrement happens in the single statement
// Execution time is less than while and do while loops as for both while and do while statements will be executed one after another
// Number of statements written will be less as compared to while and do while

// When to use while, do while and for
// * When you know the number of iterations in advance use for loop
// * When you are not sure about number of iterations, and loop termination is based on the condition use while loop
// * If you want to execute the loop at least once, use do while loop