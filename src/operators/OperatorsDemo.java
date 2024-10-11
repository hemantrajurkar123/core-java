package operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		// There are 6 types of operators
//		Types of operators
//		----------------
//		1) Arithmetic operators   + - * / % 
//		2) Relational/comparison operators  >  >=  <  <=  !=  == 
//		3) Logical operators   &&   ||  !
//		4) Increment & Decrement operators  ++  --
//		5) Assignment   =   +=   -=   *= /=  %=
//		6) conditional/ternary operator  ?: 
//
//		Unary Operators: ++  -- =   +=   -=   *= /=  %=  !
//		Binary operators: + - * / % >  >=  <  <=  !=  ==  &&   ||
//		ternary operator:   ?:

		int a = 20, b = 10;

		// Arithmetic operators
		System.out.println("Addition is :" + (a + b));
		System.out.println("Subtraction is :" + (a - b));
		System.out.println("Multiplication is :" + (a * b));
		System.out.println("Division is :" + (a / b));
		System.out.println("Reminder is :" + (a % b));

		// Relational or comparison operators
		// Returns boolean values- true or false

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);
		System.out.println(a == b); // == is comparison operator and = is an assignment operator

		// Logical operators &&, ||, !

		// Returns the boolean value- true or false
		// It works between two boolean values

//		x	y	x&&y	x||y	!x	!y
//		---------------------------------------------
//		true	true	true	true	false	false	
//		true	false	false	true		true
//		false	true	false	true	true
//		false	false	false	false

		boolean x = true, y = false;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		// example
		boolean b1 = 20 > 10;
		boolean b2 = 20 < 10;

		System.out.println("value of b1 is " + b1); //true
		System.out.println("value of b2 is " + b2); //false
		
		System.out.println(b1 && b2); //false. operating on the results of the above statements
		System.out.println(b1 || b2); //true



	}

}
