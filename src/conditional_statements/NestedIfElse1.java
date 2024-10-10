// Write a program to print the name of the day of the week according to its number
// For example 1=Sunday, 2=Monday and so on

package conditional_statements;

public class NestedIfElse1 {

	public static void main(String[] args) {
		int numberOftheDay = 5;
		
		if (numberOftheDay == 1) 
		{
			System.out.println("Sunday");
		}
		else if(numberOftheDay==2) {
			System.out.println("Monday");
		}
		else if(numberOftheDay==3) {
			System.out.println("Tuesday");
		}
		else if(numberOftheDay==4) {
			System.out.println("Wednesday");
		}
		else if(numberOftheDay==5) {
			System.out.println("Thursday");
		}
		else if(numberOftheDay==6) {
			System.out.println("Friday");
		}
		else if(numberOftheDay==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid week number");
		}
	}

}
