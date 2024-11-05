package Polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(); // method 1
		mo.add(20, 30);// method 2
		mo.add(50.0, 60);// method 3
		mo.add(40, 5.0);// method 4
		mo.add(10.0, 20.0);// method 5

	}

}

// Based on the arguments provided, the method call will locate the method which matches the number,type and order of the parameters defined in the method
