package oops_concepts;

public class Methods {

	static void myMethod() {
		System.out.println("I am a method");
	}
	
	// public method
	
	public void myPublicMethod() {
		System.out.println("I am a public method which can be accessed only through objects");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();
		
		Methods obj=new Methods();
		obj.myPublicMethod();
	}

}

// Methods are declared within the class (before the main method). We call these methods inside the main method
// static methods can be accessed without creating an object. Public method can be accessed only with objects
// This public method can be called in the main method with syntax obj1.myPublicMethod()