package callbyvalue_callbyref;

public class TestMain {

	public static void main(String[] args) {

		Test obj1=new Test();
		obj1.myNum=10;
		System.out.println("Value before method "+obj1.myNum);
		obj1.addMethod(obj1);
		System.out.println("Value after method "+obj1.myNum);

	}

}

//practice purpose