package Encapsulation;

public class ThisKeyword {

	int x, y; // class variables/instance variables

	void setValues(int x, int y) {      //local variables
		this.x = x;
		this.y = y;
	}

	void displayValues() {
		System.out.println(x+"  "+y);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.setValues(10, 20);
		th.displayValues();
	}

}

// There are 2 types of variables in Java.1. Class variables and 2. Local variables.
// Suppose we use same variable names for class variables and local variables, methods using these varibles will not recognize between which is class variable and which is local varible
// To differentiate the class variable we can use 'this' keyword
// This keyword always refers to the class varibles
