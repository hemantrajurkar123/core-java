package callbyvalue_callbyref;

public class CallByReference {
	
	int num;
	
	void method2(CallByReference cr) {
		cr.num=num+10;
		System.out.println(cr.num);
	}

}

// We are just created a template here for method2()
// It is similar to call by value (as we usually pass values directly through parameters)
// But here instead of passing primitive data types as an arguments, we are passing the object of the class CallByReference
// This method will be initialized (called) in the main method
// Call by reference simply means, we are passing the parameter as object reference in the method