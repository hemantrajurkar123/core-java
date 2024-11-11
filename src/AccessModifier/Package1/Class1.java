package AccessModifier.Package1;

public class Class1 {

//	private int x=100; // can be accessed only within the class
//	public int x=110; // can be accessed anywhere in the project
	protected int y = 50; // can be only accessed through inheritance
}

// Access Modifiers

//1. Public-Can be accessed everywhere in the project
//2. Protected- Within the package + outside the package. But we need to use inheritance for using the varibles with protected.
//3. Default- Within the package
//4. Private- Only within the class