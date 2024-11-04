package methods_and_constructors;

public class Student {
	int stuid;
	String stuname;
	char grade;
	
	void printStudentdata() {
		System.out.println(stuid+" "+stuname+" "+grade);
	}
	
	//Setting the values of the variables in the class by using a method
	void setStudentData(int id, String name, char gr) {
		stuid=id;
		stuname=name;
		grade=gr;
	}
	//Setting the values of the variables in the class by using constructor
    // Notice we have not provided any return type to constructor, not even void, because constructor never returns a value
	Student(int id, String name, char gr){
		stuid=id;
		stuname=name;
		grade=gr;
	}
}
