package operators;

public class IncrementDecrementOperators {

	public static void main(String args[]) {
		int a = 10;

		// scenario 1: to increment the value of a by 1
		a = a + 1;
		System.out.println("The value of a is :" + a);

		// scenario 2: increases the value of b by 1 using an increment operator
		// post increment
		int b = 10;
		int res = b++;
		System.out.println("The value of res is :" + res); // 10
		// in this case the value of res will be 10 because it will first assign the value
		// of b to res, and then it will increment it

		// scenario 3: increases the value of c by 1 using an increment operator
		// Pre increment: In this case the value of c will be first incremented and then
		// assigned to the res variable
		int c = 10;
		int result = ++c;
		System.out.println("The value of result is  :" + result);// 11

		// Same is the case with decrement operators

		// scenario 1: to decrement the value of d by 1
		int d = 20;
		d = d - 1;
		System.out.println("The value of d is  :" + d);// 19

		// scenario 2: to decrement the value of e by using decrement operator --
		// post decrement
		int e = 20;
		result = e--;
		System.out.println("The value of e is  :" + result);// 20
		// here first the value of e will be assigned to the result variable first and
		// then it will be decremented

		// scenario 3: to decrement the value of f by using decrement operator --
		// pre decrement
		int f = 20;
		int result1 = --f;
		System.out.println("The value of result is  :" + result1);// 19
		// here first the value of e will be first decremented and then assigned to the
		// result1 variable

	}

}
