package finalkeyword;

class Test {

	final int a = 100;

}

public class FinalKeyword {

	public static void main(String[] args) {
		Test t = new Test();
		//t.a = 200; // can not change the value of 'a' in the child class as it is marked final in the parent class
		System.out.println(t.a);
	}

}

// Final keyword
//Variable- We can not change the value of the variable. (It will remain constant)
//Method- Final method can not be overridden in the child class
// Class- Final class can not be extended to the child class
