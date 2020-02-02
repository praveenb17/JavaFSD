// You are asked to create an application for registering the details of jobseeker. The
// requirement is:
// Username should always end with _job and there should be at least minimum of 8 characters to the
// left of _job. Write a function to validate the same. Return true in case the validation is passed. In case
// of validation failure return false.

import java.util.Scanner;

class JobseekerAppln{
	public static void main(String[] args) {

		String input = inputUsername();
		boolean validation = validationCheck(input);
		System.out.println(validation);
		if(validation == true)
			System.out.println(" Username is valid.");
		else
			System.out.println(" Username is invalid!!");
	}

	public static String inputUsername()
	{
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		return input;
	}

	public static boolean validationCheck(String input)
	{
		if(input.length() < 12)
			return false;
		int size = input.length();
		System.out.println(size);
		String postFix = "_job";
		System.out.println(input.charAt(11));
		System.out.println(input.substring(size-4,size));
		String inputEndString = input.substring(size-4,size);
		System.out.println(inputEndString);
		if(inputEndString != "_job")
			return false;
		return true;
	}
}