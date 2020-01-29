//instance variables

	class VariableDemo{
		int var;  //instance
		public static void main(String[] args) {
			VariableDemo ref = new VariableDemo(); // ref is local
			//ref.var=20;
			System.out.println(ref.var);
		}
	}


//local variables

	// class some{
	// 	public static void main(String[] args) {
	// 		int a;//local
	// 	}

	// 	void a()
	// 	{
	// 		ch b;//local
	// 	}
	// }


//block level variables

	//for(int i=0; i<6 ; i++) 
	// {

	// }
	// print-i;//error i is block level

//block level and local level variables should not have a same name
