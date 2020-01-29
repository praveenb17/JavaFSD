//creating objects
Type dentifier = new type();

	//example
		Human ref = new Human();
		//ref is not an object, it's a reference refering to actual object


//another way

	Human ref;
	ref = new Human();

//efficent way

	new Human(); //unreferneced object
	//example
		new Human().eat(); //calls eat method and becomes eligible for Garbage Collection as it's not refering by anything 



