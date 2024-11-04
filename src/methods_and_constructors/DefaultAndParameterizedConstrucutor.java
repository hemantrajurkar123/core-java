package methods_and_constructors;

public class DefaultAndParameterizedConstrucutor {
	int x,y;

	
// Default constructor
// It does not take any parameters	
 DefaultAndParameterizedConstrucutor() { 
		x=10;
		y=20;
	}
 
 //Parameterized constructor
 DefaultAndParameterizedConstrucutor(int a, int b){
	 x=a;
	 y=b;
 }
 
 void add() {
	 System.out.println(x+y);
 }
 
 public static void main(String[] args) {
	 DefaultAndParameterizedConstrucutor constr=new DefaultAndParameterizedConstrucutor();
	 constr.add();
	 
	 DefaultAndParameterizedConstrucutor constr1=new DefaultAndParameterizedConstrucutor(100,200);
	 constr1.add();
		
	}

}

// we can not invoke multiple constructor at the same time with the same object name. But in case of methods it is possible.
