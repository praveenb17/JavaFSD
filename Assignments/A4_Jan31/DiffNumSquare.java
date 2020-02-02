//Program to find the differnce of Squares of first n numbers and square of sum of first n numbers

import java.util.Scanner;
class DiffNumSquare{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		diffNumSquare(n);
	}

	public static void diffNumSquare(int n)
	{
		double r = (n*(n+1)/12) * (-3*n*n + n + 2);
		System.out.println(r);
	}
}
