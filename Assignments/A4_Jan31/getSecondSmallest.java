// Create a method which accepts an array of integer elements and return the
// second smallest element in the array

import java.util.Scanner;
import java.util.Arrays;
class GetSecondSmallest{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Integer []input = new Integer[size];
		for(int i = 0; i < size; i++)
			input[i] = in.nextInt();
		int s = getSecondSmallest(input);
		System.out.println("The second smalles number is: "+s);
	}

	public static int getSecondSmallest(Integer[] input)
	{
		Arrays.sort(input);

		return input[1];
	}

}