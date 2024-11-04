package callbyvalue_callbyref;

public class CallByValue {
	int number; // This is a class variable

	void method1(int num) {
		num = num + 10;
		System.out.println("Call by value " + num);

	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();

		int number = 100;
		System.out.println("Value before method " + number); //100

		cv.method1(number); // we are passing the 'value' in the method
		System.out.println("Value after method " + number); //100

	}

}

// Call by value simply means we pass the value directly while calling the method using an object reference (here cv is the object reference)
// Original value (100) will not be impacted
// It is just passing the copy of the variable in the method. The original number remains the same
// In call by reference the original value of the variable changes