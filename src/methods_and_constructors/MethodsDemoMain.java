package methods_and_constructors;

public class MethodsDemoMain {

	public static void main(String[] args) {
		MethodsDemo m1 = new MethodsDemo();
		m1.method1();
		
		MethodsDemo m2=new MethodsDemo();
		String message=m2.method2();
		System.out.println(message);
		
		MethodsDemo m3=new MethodsDemo();
		m3.method3("Hemant");
		
		MethodsDemo m4=new MethodsDemo();
		System.out.println(m4.method4("John"));
		
	}

}
