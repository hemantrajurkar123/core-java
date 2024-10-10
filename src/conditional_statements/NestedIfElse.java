package conditional_statements;

public class NestedIfElse {

	public static void main(String[] args) {

		if (1 == 1) {
			if (2 == 1) {
				System.out.println("ABC");
			}
		} else {
			System.out.println("XYZ");
		}
	}
}

// the output of this program will be none
// in the first if block the condition 1==1 is true so it will go to the next if block
// here 2==1, the condition is false, so it will not print anything
// the code will not go to the else block because it is the else block of first if statement.
// The execution will enterer the else block only when the first if condition becomes false.