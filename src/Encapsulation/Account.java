package Encapsulation;

public class Account {
	
	private int accno;
	private String name;
	private double amount;
	
	public void setAccno(int accno) {
		this.accno=accno;
		//sets the accno provided when called it in the main method to the class variabale
	}
	
	public int getAccNo() {
		return accno;
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}


// Encapsulation means, encapsulating the variables and methods in the class
// To achieve the encapsulation, we have to mark all the class variables in the class as a private
// The class variables can be only accessed through the methods. They can not be accessed through the object reference such as obj.accno=100 (not valid)
// To set the value and get the value of the class variables we need to use setters and getters method for each and every variable
// Setter methods will set the value of the variable and getter methods will get the value of the variable
// The getter method will return the value of the variable. So if we want to perform further action on it, we can do it. If it only do syso, it will just print the value in the console. But we can not perform any action on it.
// So, for every variable there will be 2 methods. 1 setter method and 1 getter method
// If there are 10 variables, there will be 20 setters and getter methods
// To generate so many setters and getters, there is a shortcut in eclipse. Source-->Generate setters and getters
