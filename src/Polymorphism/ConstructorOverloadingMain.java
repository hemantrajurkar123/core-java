package Polymorphism;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
//		ConstructorOverloading co=new ConstructorOverloading(); // default constuctor will be invoked as we have not passed any parameters
//		System.out.println(co.volume()); 

//		ConstructorOverloading co = new ConstructorOverloading(10.5, 9.6, 2.3); // parameterized constructor 1 will be invoked																			
//		System.out.println(co.volume());
		
		ConstructorOverloading co = new ConstructorOverloading(5.5); 	// parameterized constructor 2 will be invoked
		System.out.println(co.volume());
	}

}
