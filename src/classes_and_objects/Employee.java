package classes_and_objects;

public class Employee {
	
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

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="John";
		e1.job="Developer";
		e1.salary=60000;
		e1.display();
		
		
		Employee e2=new Employee();
		e2.id=102;
		e2.name="Mike";
		e2.job="Tester";
		e2.salary=50000;
		e2.display();


	}

}

/*class is collection of attributes(variables) and behavior(methods).

Animal --> Dog, Elephant, Horse etc...
Student  --> Kim, David, Scott etc....
Employee ---> John, Smith, Mary etc...

class
---------
1) class is collection of variables and methods
2) class is logical entity/blue print
3) will not occupy space in the memory.


class Employee
{
variables
methods
}

object is an instance of a class.

object
-------------
1) object is an instance of a class/ object will be created by using class.
2) object is physical entity
3) occupy space in memory
4) we can create multiple objects for single class.

Employee emp=new Employee();
 */

// objects of a class needs to be created in the main method only. Because execution starts from the main method
// Once the execution starts, objects will be created and space will be allocated in the memory for these objects in runtime
// You can not create objects outside the main method. Also, you can not create an object inside any other method
// Once the object of a class is created, all the variables and methods from the class becomes available to that object
// We can use these variables and methods to perform different operations

//Method
// Every method after doing certain operations needs to return a value
// But sometimes method do not return anything. For example, in the case of displaying the data of the variable method does not return anything
// In this case when method does not return anything, we can specify the method as void