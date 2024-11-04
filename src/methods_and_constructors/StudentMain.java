package methods_and_constructors;

public class StudentMain {

	public static void main(String[] args) {

		// There are 3 methods to assign the data to variables
		// 1. Using object reference
		// 2. Using a method
		// 3. Using constructor

		// 1. Using object reference
//		Student stu=new Student();
//		stu.stuid=1;
//		stu.stuname="Jack";
//		stu.grade='A';
//		stu.printStudentdata();

		// 2. Using a method
		// In this case we will pass the parameters in the method and that will set the
		// values of variables for the class
//		Student stu1=new Student();
//		stu1.setStudentData(2, "Chris", 'B');
//		stu1.printStudentdata();

		// 3. Using constructor
		// constructor is same like a method, but the values are initialized at the time
		// of the object creation
		// method may or may not return a value, but constructor never returns a value
		// method can have different names, but constructor has the same name as a class
		// name
		
		Student stuconstr=new Student(3,"Jane",'c'); // notice that we have not used the object reference to initialize the values. When we create the object and pass values, these values will automatically get initialized
		stuconstr.printStudentdata(); // to call the printStudentdata() we have to use the object
	}

}


/*How many ways we can store data into varaibles
-------------------
1) by using object reference varaible
2) method
3) constructor

Method:
-----------------
1) Method name can be anything
2) Method may or may not return a value
3) If method is not returnign any value then specify void
4) Method can take parameters/arguments
5) We have to invoke/call methods explicitely through object
6) used for specifying logic

Constructor
--------
1) Constructor name should be same as class name.
2) Constructor will never return a value ( not even void)
3) We dont specify the void
4) Constructor can take parameters/arguments
5) Constructor automatically invoked at the time of object creation.
6) used for initilizing the values of the variables.
*/
