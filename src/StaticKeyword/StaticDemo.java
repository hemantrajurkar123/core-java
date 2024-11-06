package StaticKeyword;

public class StaticDemo {

	static int a = 20;
	int b = 10;
	
	static void m1() {
		System.out.println("This is a static method");
	}
	
	void m2() {
		System.out.println("This is a non static method");
		m1(); // non static method can access anything directly
	}

//	public static void main(String[] args) {
//		System.out.println(a); // a can be accessed without creating the object
//		StaticDemo s = new StaticDemo();
//		m1(); // static method can call other static method without an object. 
//		s.m2(); //To call m2() we have to use s.m2() as m2() is a non static method
//	}

}

//When we use the keyword static, the variables and methods can be accessed without creating the object of that class
//Why use static method? consider a scenario for the Employee class, where we have empid,empname and departmentid
//We can create multiple objects of the Employee class. The empid and empname will different in each object but consider the departmentid is same in every object
//In this case every object will occupy the space for department id. It will be a waste of memory
//To avoid this we can mark the variable as static at the class level itself. Say, static int departmentid=10;	
//It will allocate the memory only once for the variable and will be shared across every object of the class	
//Similar to variables, methods can also be static

/*
 * static keyword ---- 
 * 1) static methods can access static stuff directly (without object). 
 * 2) static methods can access non-static stuff through object. 
 * 3) non-static methods can access everything directly.
 */
