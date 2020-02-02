// Create a class with a method which can calculate the sum of first n natural
// numbers which are divisible by 3 or 5

import java.util.Scanner;

class CalculateSum{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n: ");
		int n = in.nextInt();
		int sum = calculateSum(n);
		System.out.println("Calculated sum is: "+sum);
	}

	public static int calculateSum(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			if((i % 3) == 0 || (i % 5) == 0)
				sum += i;
		}
		return sum;
	}
}