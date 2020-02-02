// Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;

class SumOfCubes{
	public static void main(String[] args) {
		int n = input();
		sumOfCubes(n);
	}

	public static int input()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		return n;
	}

	public static void sumOfCubes(int n)
	{
		System.out.println("Enter" + n +" digit/digits number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = result(number);
		System.out.println(sum);
	}

	public static int result(int number)
	{
		int sum = 0;
		int r = 0;
		if(number < 10)
			return (number * number * number);
		while(number > 0)
		{
			r = number % 10;
			sum += (r*r*r);
			number /= 10;
		}

		return sum;
	}
}