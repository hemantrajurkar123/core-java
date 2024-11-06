package Inheritance;

class C {
	int a;

	void display() {
		System.out.println(a);
	}
}

// Child class
class D extends A {
	int b;

	void show() {
		System.out.println(b);
	}

}

class E extends B {
	int c;

	void print() {
		System.out.println(c);
	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		E eobj = new E(); // object of class E. Class E has now variables and methods of class C and class D
		eobj.b = 300;
		eobj.show();
		eobj.c = 9000;
		eobj.print();

	}

}
