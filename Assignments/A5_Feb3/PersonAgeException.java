// Validate the age of a person and display proper message by using user defined
// exception. Age of a person should be above 15.

import java.util.Scanner;

class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}

class PersonAgeException{
	public static void main(String[] args) {
		validateAge();
	}

	public static void validateAge()
	{
		Scanner in = new Scanner(System.in);
		try{
			int age = in.nextInt();
			if(age < 16)
				throw new MyException("Retry");
			}
			catch(MyException m)
			{
				System.out.println("Age of a person should be above 15");
				System.out.println(m.getMessage());
			}
	}
}