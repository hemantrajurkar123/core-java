package interfacedemo;

interface Shape {

	int a = 10; // final and static by default
	int b = 20; // final and static by default

	public void circle();

	default void square() { // default method
		System.out.println("This is a default method square() from interface");
	}

	static void rectangle() { // static method
		System.out.println("This is the static method rectangle() from interface");
	}

}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("This is the abstract method circle() from the interface");
	}

	// own method from the class, not from the interface
	void triangle() {
		System.out.println("This is the triangle fromt the class");
	}

	public static void main(String[] args) {
		
		// Method1- To create the object of a class which implements the interface
//		InterfaceDemo idobj = new InterfaceDemo();
//		idobj.circle(); //abstract method
//		idobj.square(); // default method
//		Shape.rectangle(); //static method. Can not be called using the object of a class,as it should be called directly without using the object. But we have to give the reference of the interface for calling the method
// 		sh.triangle(); // Method from the class
		// Method2-To create the refere
		Shape sh=new InterfaceDemo();
		
		/*you are creating an instance of InterfaceDemo (a class that implements the Shape interface) and assigning it to the sh variable. 
		Since sh is of type Shape, you can only call the methods defined in the Shape interface on sh, regardless of any additional methods InterfaceDemo might have.*/
		sh.circle(); // abstract method
		sh.square(); //default method
		// sh.rectangle() // can not access the static method by object
		Shape.rectangle();
		// sh.tringle(); // can't access. The 'sh' reference variable is of type shape. It will access methods only which are present in the shape interface 
	}

}

// Interface is used for data abstraction
// Interface is a blueprint for the class
// Interface allows the abstract methods, default methods and static methods inside it
// Abstract methods will have only the template inside the interface. The actual implementation is done in the class
// We use 'implements' keyword while creating the class for implementation of the interface
// We can not just define variables in the interface. e.g. we can not just write int a, int b. Because all the variables in the interface are final and static. Therefore it is imp to provide it some intiial value.
// It is necessary to define the type of method in the interface. If it is default or static.