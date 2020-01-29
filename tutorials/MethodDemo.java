// //Methods

// //syntax:
// 	//scope returnType identifier(parameterList)
// {
// 	Body
// }

// //Example
// 	//void met()
// {

// }

//calling method

class MethodDemo{
	public static void main(String[] args) {
		System.out.println("inside main");
		new MethodDemo().met();
	}

	void met()
	{
		
		System.out.println("inside method");
	}
}