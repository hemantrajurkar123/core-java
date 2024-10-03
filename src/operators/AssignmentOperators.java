package operators;

public class AssignmentOperators {

	public static void main(String[] args) {

		// Assignment operators are shorthand for assigning values to the variables
		// These are +=, -=,*=,/= and %=

		// ex1: to increase the value of a by 5
		int a = 10;
//		a=a+5
//		with assignment operators
		a += 5;
		System.out.println("value of a is :" + a);// 15

		// ex2: to decrease the value of b by 5
		// b=b-5;
		int b = 10;
		b -= 5;
		System.out.println("value of b is :" + b);// 5

		// ex3: to multiply the value of c by 5
		// c=c*5;
		int c = 10;
		c *= 5;
		System.out.println("value of c is :" + c);// 50

		// ex4: to divide the value of e by 5
		// e=e/5;
		int e = 10;
		e /= 5;
		System.out.println("value of e is :" + e);// 2

		// ex5: to module the value of f by 5
		// e=e/5;
		int f = 10;
		f %= 5;
		System.out.println("value of f is :" + f);// 0
	}

}
