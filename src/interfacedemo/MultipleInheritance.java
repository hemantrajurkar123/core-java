package interfacedemo;

public class MultipleInheritance implements Interface1, Interface2{ // We can extend multiple interfaces in the single class
	
	// abstract method from Interface1
	public void m1() {
		System.out.println("This is method m1 from the Interface1");
	}
	
	// abstract method from Interface2
	public void m2() {
		System.out.println("This is method m2 from the Interface2");
	}

	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.m1(); 
		mi.m2();
		System.out.println(mi.x); // int x from Interface1
		System.out.println(mi.y); // int y from Interface2
	}

}

// This is the multiple inheritance
// The class has 2 parents, Interface1 and Interface2
// Because we can not extend 2 classes at once in the child class, but we can extend multiple interfaces in the child class, we can execute the multiple inheritance
