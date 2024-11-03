package classes_and_objects;

public class EmployeeOnlyClass {

	int id;
	String name;
	String job;
	int salary;

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(salary);
	}

}

// This class will be executed in another class called EmployeeMain

// We need a main method to execute the class. However, We can create a class without the main method.
// For this, we need to execute the class (by creating an object) in another class which has the main method
// We can directly create objects of the class in another class (which contains the main method) without importing the class if both the classes are in the same package