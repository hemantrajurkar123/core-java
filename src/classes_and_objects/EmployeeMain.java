package classes_and_objects;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 103;
		e1.name="Ming";
		e1.job="Business Analyst";
		e1.salary=45000;
		e1.display();
	}

}


// This class executes the EmployeeOnlyClass
// In the real time this will be the situation. There will be multiple classes stored elsewhere in the project. And there will be a single main class that will be the starting point of the execution for these multiple classes.
// If the classes that needs to be executed are situated in different packages, then we need to import them at the top of the class where main mehtod is present.
// The syntax is: import packagename.classname;