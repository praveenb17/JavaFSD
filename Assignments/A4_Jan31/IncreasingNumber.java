 // Create a method to check if a number is an increasing number

import java.util.Scanner;
class IncreasingNumber{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		boolean increasing = checkNumer(number);

		if(increasing == true)
			System.out.println("It is an increasing number");
		else
			System.out.println("It is not an incresing number");
	}

	public static boolean checkNumer(int number)
	{
		Integer n = number;
		String temp = n.toString();
		for(int i = 0; i < temp.length()-1; i++)
		if((int)temp.charAt(i) > (int)temp.charAt(i+1))
			return false;
		
		return true;
	}
}