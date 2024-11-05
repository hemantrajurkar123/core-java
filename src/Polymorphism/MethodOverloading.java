package Polymorphism;

public class MethodOverloading {
	int a = 100, b = 200;

	// method 1
	void add() {
		System.out.println(a + b);
	}
	// method 2
	void add(int x, int y) {
		System.out.println(x + y);
	}
	
	// method 3- Data types are different than method 2
	void add(double x, int y) {
		System.out.println(x + y);
	}
	
	// method 4- Order of parameters is different than method 2
	void add(int y, double x) {
		System.out.println(x + y);
	}
	
	void add(double x, double y) {
		System.out.println(x+y);
	}
}

// Generally we can not have methods with same name in the class.
// But we can achieve this by method overloading. i.e. Having more than one methods with same method name
// This is called polymorphism. It is the ability to take many forms. So same method can take many forms
// Whenever we call these methods, the execution will be dependent on its parameters provided

/*
 * 4 rules are applicable ---- 
 * 1) Method names should be same 
 * 2) number of parameters should be different 
 * 3) Data type of parameters should be different
 * 4) Order of parameters should be different
 */
