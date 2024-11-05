package callbyvalue_callbyref;

public class Test {
	int myNum;
	
	void addMethod(Test t) {
		t.myNum=t.myNum+100;
		System.out.println(t.myNum);
		
	}

}


//practice purpose