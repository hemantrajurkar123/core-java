package methods_and_constructors;


public class MethodsDemo {
	
	// There are 4 types of methods
	//1. No params, no return value
	//2. No params, returns value
	//3. Take params, no return value
	//4. Take params, returns value
	
	//1. No params, no return value
	
	void method1() {
		System.out.println("Hello World from method1");
	}
	
	//2. No params, returns value

	String method2(){
		return ("Hello from method 2");
		
	}
	//3. Take params, no return value
	void method3(String s) {
		System.out.println("Hello "+s);
		
	}
	
	//4. Take params, returns value
	String method4(String s) {
		return ("Hello "+s);
	}



}
