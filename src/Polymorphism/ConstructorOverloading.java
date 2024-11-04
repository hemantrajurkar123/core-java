package Polymorphism;

public class ConstructorOverloading {
	double width, height,depth;
	

	//default constructor
	ConstructorOverloading() {
		width = 1;
		height = 2;
		depth = 3;
	}

	// parameterized constructor 1
	ConstructorOverloading(double x, double y, double z)
	{
		width=x;
		height=y;
		depth=z;
	}
	
	// parameterized constructor 2
	ConstructorOverloading(double len)
	{
		width=height=depth=len;
		
	}
	
	double volume() {
		return (width * height * depth);
	}
}

//Same 4 rules are applicable for constructor overloading

/*
 * 4 rules are applicable ---- 1) Method names should be same 2) number of
 * parameters should be different 3) Data type of parameters should be different
 * 4) Order of parameters should be different
 */