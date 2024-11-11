package AccessModifier.Package1;

import AccessModifier.Package2.Class3; // we need to import the package if we want to use it in another package 

//public class Class2 extends Class1{
//
//	public static void main(String[] args) {
//		Class1 obj=new Class1();
//		System.out.println(obj.x);
//		Class2 obj2=new Class2(); // object of protected variable y from Class1 from the same package
//		System.out.println(obj2.y);

//		
//	}
//
//}
public class Class2 {
	public static void main(String[] args) {
		Class3 obj3=new Class3();
//		System.out.println(obj3.z); // we can not use the default variable or method outside the package

	}
}


