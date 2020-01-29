//inheritance in Java
	// Core inheritance
	// Type inheritance
	// Base class is called as Superclass and Derived class is called as subclass


class Human{

	final void breathe()
	{
		System.out.println("breathe");
	}
	void eat()
	{
		System.out.println("eat");
	}
	void walk()
	{
		System.out.println("walk");
	}
}

class Shruti extends Raj{
   @Override
   void swim()
   {
   	System.out.println("Shruti is swimming");
   }
}

class Raj extends Human{
 	
 	 void swim(){
 		System.out.println("Raj is swimming");
 	}	
}

class InheritancePlay{
	public static void main(String[] args) {
		Shruti ref = new Shruti();
		ref.swim();
		ref.breathe();
		ref.swim();//ERROR
		Raj r = new Raj();
		r.swim();
		r.walk();
	}
}


//override annotation

//@Override --> it gives error if can't able to override the superclass method


//exception scenario 1 : Super class methods called overridden, subclass is overriding method

//private methods can't be inherited

//Overriding happens only when the scope of subclass method is same or larger than superclass method (Overriding Method)


//We should make methods in super class as "final" for protecting from overriding (Stopping people from changing the definition of methods)

//Can keep class as final to prevent from inheriting




