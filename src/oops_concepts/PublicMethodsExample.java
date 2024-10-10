package oops_concepts;

public class PublicMethodsExample {
	public void fullThrottle() {
		System.out.println("The car is going in the full speed");
	}

	public void carSpeed(int maxSpeed) {
		System.out.println("The car speed is "+maxSpeed+" km/hr");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicMethodsExample myCar=new PublicMethodsExample();
		myCar.fullThrottle();
		myCar.carSpeed(200);
	}

}
