package Inheritance;

class Parent {
	void show(int a) {
		System.out.println(a);
	}
}

class Child1 extends Parent { // inherited properties of Parent class. Now has show() and display() methods
	void display(int b) {
		System.out.println(b);
	}

}

class Child2 extends Parent { // inherited properties of Parent class. Now has show() and print() methods
	void print(int c) {
		System.out.println(c);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.show(500);
		c1.display(300);
		
		Child2 c2=new Child2();
		c2.show(10000);
		c2.print(2000);
	}

}
