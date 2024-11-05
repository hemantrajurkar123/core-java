package methods_and_constructors;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
 // Assigning values to class varaibles
		//1. using the object reference
		
//		Employee e1=new Employee();
//			e1.empid=100;
//			e1.empname="Sachin";
//			e1.grade='B';
//			e1.salary=50000;
//			e1.displayEmployee();
		
		//2. using method
		
//		Employee e2=new Employee();
//		e2.setEmployeeDetails(101, "Jas", 'A', 40000);
//		e2.displayEmployee();
		
		//3. Using constructor
		
		Employee e3=new Employee(102,"Virat",'B',70000);
		e3.displayEmployee();
	}

}

//practice purpose