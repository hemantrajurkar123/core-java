package operators;

public class TernaryOperators {

	public static void main(String[] args) {
		// it is if else kind of operator

		// syntax: variable=expression? result1:result2;

		// ex1

		int a = 200, b = 100;

		int result = (a > b) ? 200 : 100; // you have to define the data type of the results according the values it
											// will store
		System.out.println(result);

		// ex2

		int person_age = 20;
		String res = (person_age > 10) ? "Eligible for vote" : "Not eligible for vote"; // here the data type of res is String as the result will be in the string format
		System.out.println(res);
	}

}
