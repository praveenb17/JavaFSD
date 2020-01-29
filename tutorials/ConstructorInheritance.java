//Constructor in Inheritance
	//in evry constructor of subclass, it calls superclass constructor at the very first line

Class Super{ //Note "super" is a keyword and it's not suggested to use class name as same as keywords
	Super(int n)
	{
		System.out.println("Inside superclass");
	}
	Super()  //always suggested to put parameterless constructor to save from errors
	{}
}

Class Sub extends Super{
	

	Sub()
	{
		super(0);
		System.out.println("Inside subclass");
	}
}

class ConstructorInheritance{
	public static void main(String[] args) {
		Sub a= new Sub();
	}
}