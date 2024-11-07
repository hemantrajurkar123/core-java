package MethodOverrriding;

public class Animal {
	String color = "white";

	void eat() {
		System.out.println("Eating..");
	}
	
	Animal(){
		System.out.println("This is the animal");
	}
	
	Animal(String name){ //constructor overloading
		System.out.println(name);
	}

}

class Dog extends Animal {
	String color = "Black"; // variable overridden in the child class

	void displayColor() {
		System.out.println(color);// black
		System.out.println(super.color); // white

	}

	void eat() { // method overriding
//		System.out.println("Eating bread...");
		super.eat(); // it will call the eat() method from parent class. We have to call it into the
						// child class method
	}
	
	Dog(){ // Dog constructor
//		System.out.println("This is the dog");
	}
	
	Dog(String name){ //constructor overloading
		super(name); // passing the name to the parent constructor through the child constructor
	}
}

// Similar to methods, class variables can be overridden
// If the parent class variable is overridden in the child class, and you still needs to access the parent class variable, you can use the super.varible_name

//Super keyword will be used to invoke the immediate parent class variable
//Super keyword will be used to invoke the immediate parent class method
//Super keyword will be used to invoke the immediate parent class constructor

//In the case of constructor, if you create the object of the child class constructor, it will automatically invoke the immediate parent class constructor