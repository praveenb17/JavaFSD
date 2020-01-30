
// Wrapper Classes
	//javap java.lang.Integer  -> command to check the inbuilt methods of Integer wrapper class


	// int value=9380; //it's primitive type
		// -for every primitive type theres a wrapper class

			// primitive - Wrapper
			// boolean - Boolean
			// byte - Byte
			// short - Short
			// char - Character
			// int - Integer
			// long - Long
			// float - Float
			// double - Double

			// if first letter is capital then it's warapper, except int and char



class WrapperClassDemo{
	public static void main(String[] args) {

		// Integer i = new Integer("98798");
		// Integer i = 987398; //this works as Wrapper after Java 5.0
		
		//i++; //It's working after Java 5.0 (AutoBoxing and Unboxing feature --> method to overcome unwrap and rewrap)
			//behind the scenes (implicit)
				//1. int temp = i.intValue(); //AutoBox
				//2. temp++;
				//3. i = new Integer(temp); //UnBox

		Integer i = 0;  //It has to be initialized first before using or else reults in an error
		
		// System.out.println(i.max(8,345)); // Prints 345
    	
    	//  System.out.println(i.min(8,34));  // Prints 8
		
		// String str = i.toString();

		// System.out.println(i.compare(46,46));  //If a > b --> 1, if a < b --> -1 , if a == b -->0 (a -> firstNum, b -> secondNum)

		// System.out.println(i.reverseBytes(45)); // It reverse the 32 bit size int bytes in bit level and prints the output
		
		// System.out.println(i.reverse(1));  // It revrse the 32 bit representation of a number

		// System.out.println(i.signum(65));  // If num >0 prints 1, If num <0 prints -1 and if num is 0 prints 0
			
		// System.out.println(i.bitCount(7)); // It returns number of bits set in the number, it prints 3 for number 7
		
		// System.out.println(i.numberOfLeadingZeros(1)); //It prints 31 as Integer is 32 bits and if LSB is 1, then it will have 31 leading 0s
	

	}
}