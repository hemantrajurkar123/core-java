package MethodOverrriding;

class Bank {
	double roi() {
		return 0;
	}
}

class ICICI extends Bank {
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 9.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		System.out.println(ic.roi());

		SBI sb = new SBI();
		System.out.println(sb.roi());
	}

}

// Method overriding is an inheritance concept
// We can change the implementation of the method in the child class inherited from the parent class
// We can not change the template of the method in the child class. The return type, number and data type of the parameters remains the same
