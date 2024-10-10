package oops_concepts;

public class ClassesObjects {

	int x = 10;
    int y= 30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesObjects obj1 = new ClassesObjects(); // create an object of class ClassesObject
		ClassesObjects obj2 = new ClassesObjects();
		System.out.println("Object1 is: " + obj1.x);
		obj2.x = 20; // change the value of x in the second object
		System.out.println("Object2 x is: " + obj2.x);
		System.out.println("Object2 y is: " + obj2.y);

	}

}


// Whatever you will write in a class, before main method, will be copied to the object when you will create it
// You can not print the object and see its content like in js as System.out.println("Object1 is: " + obj1);
// You can access the properties of object for ex obj1.x
// You can modify the value of an attribute in the object as obj2.x=30. it will override the value of x in the object.
// value of x in other objects will remain same
