package callbyvalue_callbyref;

public class CallByReferenceMain {

	public static void main(String[] args) {

		CallByReference cr1=new CallByReference();
		cr1.num=100;
		System.out.println("Value before method "+cr1.num); //100
		cr1.method2(cr1); //110
		System.out.println("Value after method "+cr1.num); //110
	}

}


// Here we have created an object of type 'CallByReference'
// We are passing the object cr1 as a parameter in the method
// Before passing the object as para, we have set the value of class variable as 100. So 100 will get passed in the method2()
// method2() will do the operation on this value of cr1.num which has a value of 100 and will print the result
// Original value of the variable(100) will be impacted
