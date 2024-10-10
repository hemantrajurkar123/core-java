package oops_concepts;

public class ConstructorEx {
	int x;
	
	public ConstructorEx() {
		x=10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEx conobj=new ConstructorEx();
		System.out.println(conobj.x);
	}

}

// constructors initialize the value of the class attributes when object of that class is created