package methods_and_constructors;

public class Employee {
	
	int empid;
	String empname;
	char grade;
	int salary;

	void displayEmployee() {
		System.out.println(empid+" "+empname+" "+grade+" "+salary+" ");
	}
	
	//method to set values of class variables
	void setEmployeeDetails(int id,String name, char g,int sal) {
		empid=id;
		empname=name;
		grade=g;
		salary=sal;
	}
	
	//constructor to set values of class variables

	Employee(int id,String name, char g,int sal) {
		empid=id;
		empname=name;
		grade=g;
		salary=sal;
	}

}


//practice purpose
