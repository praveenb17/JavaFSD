// The Fibonacci sequence is defined by the following rule. The first 2 values in the
// sequence
// are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java
// program that uses both recursive and nonrecursive functions to print the nth value of the Fibonacci
// sequence

import java.util.Scanner;

class NthFibonacciSeries{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		n = fibonacciSeriesRecursive(n);	// Using recursive method
		// n = fibonacciSeriesNonrecursive(n); // Using nonrecursive method

		System.out.println("\n"+n);
	}

	public static int fibonacciSeriesRecursive(int n)
	{
		
		if(n == 1 || n == 0)
			return 1;

			return fibonacciSeriesRecursive(n - 1) + fibonacciSeriesRecursive(n - 2);
	}

	public static int fibonacciSeriesNonrecursive(int n)
	{
		if(n == 0 || n == 1) 
			return 1;

		Integer []series = new Integer[n];
		series[0] = 1;
		series[1] = 1;

		for(int i = 2; i < n; i++)
			series[i] = series[i - 1] + series[i - 2];

		return series[n-1];

	}
}