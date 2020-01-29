 // Constructors in Java

	// constructors doesn't have return type - not even void and constructors are methods
	// Constructor called every time new object is created
	// Constructors can be overloaded
	// Default constuctor will be called every time new object is creaed, if the class doesn't have one
	
 
 // Example
 	 class A{
 	 	int var;
 	 	A(int v)
 	 	{
 	 		var = v;
 	 		System.out.println("Inside Constructor");
 	 	}
 	 }

 	 class ConstructorWork{
 	 	public static void main(String[] args) {
 	 		A a = new A(24);
 	 		A b = new A(34);
 	 		A c = new A(214);
 	 	}
 	 }

 	// When instance and local variable names are same then it gives priority to local variable and this is called "shadowing"

 	// To overcome shadowing "this" operator/refernce pointer is used

	// instance variables should be private ;and setters and getter should be public.
