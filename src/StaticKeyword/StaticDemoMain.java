package StaticKeyword;

public class StaticDemoMain {
	
	public static void main(String[] args) {
		System.out.println(StaticDemo.a); // a can be accessed without creating the object. We have to use the Classname of the variable where it was defined
		StaticDemo s = new StaticDemo();
		StaticDemo.m1(); // static method can call other static method without an object. We have to use the Classname of the method where it was defined
		s.m2(); //To call m2() we have to use s.m2() as m2() is a non static method
	}

}


// When we call the static methods in another class which contains main method, Java can not recognize the from where the static varibles and methods are coming from
// These static variables and methods belongs to the class in which they are defined
// To use these methods, we have to use classname.variable name or classname.methodname syntax