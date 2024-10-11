// Write a program to print the name of the day of the week according to its number
// For example 1=Sunday, 2=Monday and so on

package conditional_statements;

public class SwitchCase {

	public static void main(String[] args) {
		int dayoftheweek = 5;
		switch (dayoftheweek) {
		case 1: // this means the variable value is 1. i.e. dayoftheweek=1
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number of the day");

		}
	}

}

// Instead of writing many if..else statements, you can use the switch statement.
// Syntax
// switch(variable)
// {
//	 case x:
//		 // code block
//		 break;
//	 case y:
//		 //code block
//		 break;
//		 ...
//	 default:
//		 //code block	 
//}
