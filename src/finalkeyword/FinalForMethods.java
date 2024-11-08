package finalkeyword;

final class Test2{  // we can not extend this class into the child class as we marked it as a final. We can not use this class in inheritance
	final void m1() {
		System.out.println("Mehtod m1 from class Test2");
	}
}

class Test3 extends Test2{
	void m1() { //method overriding. We can not override the method m1 as it is marked as final in the parent class
		System.out.println("Method m1 from extended class Test3");
	}
}

public class FinalForMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// Whenever you want that the method should not be overriden anywhere in the child classes, we can mark it as a final in the parent class
// If we use final keyword for the parent class, the class can not be extended into the child class
