package Inheritance;

// Parent class
class A {
	int a;

	void display() {
		System.out.println(a);
	}
}

// Child class
class B extends A {
	int b;

	void show() {
		System.out.println(b);
	}

}

//main class which contains the main method
public class SingleInheritance {

	public static void main(String[] args) {

		B obj = new B();
		obj.a = 100;
		obj.b = 200;
		obj.display();
		obj.show();

	}

}

// When there is only one child class inheriting the properties of the single parent class, it is called as single inheritance
// Inheritance is acquiring all the properties(variables) and behavior(methods) of one class into another class (usually parent class into the child class)
// This can be done by using the extends keyword. The class after extents keyword should be the parent class
// The child class acquires the variables and methods of the parent class
// We can then crate the object of the child class to do access the methods and variables of child class as well as the parent class

/*Objective
---------
1) re-usability
2) Avoid duplication
*/

/*types
-----------
1) single
2) multi level
3) hierarchy
4) multiple 

*/

