// Write a Java Program to validate the full name of an employee. Create and throw a
// user defined exception if firstName and lastName is blank.
import java.util.Scanner;

class MyException extends Exception{
	MyException(String s)
	{
		super(s); // It gives the msg in throw block in the output
	}
}

class EmployeeNameException{
	public static void main(String[] args) {
		employeeNameValidate();
	}

	public static void employeeNameValidate() {
		Scanner in = new Scanner(System.in);
		try{
		System.out.println("First Name: ");
		String firstName = in.nextLine();
		if(firstName.length() == 0)
			throw new MyException("\nRun again and try..");
		
		System.out.println("Second Name: ");
		String secondName = in.nextLine();
		if(secondName.length() == 0)
			throw new MyException("\nRun again and try..");
		}
		catch(MyException me)
		{
			System.out.println("Name Should not be blank!! Please enter the Fullname");
			System.out.println(me.getMessage());
		}
	}
}