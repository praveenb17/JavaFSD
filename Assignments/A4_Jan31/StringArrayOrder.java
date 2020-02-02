// Create a method that can accept an array of String objects and sort in
// alphabetical order. The elements in the left half should be completely in uppercase and the
// elements in the right half should be completely in lower case. Return the resulting array.
// Note: If there are odd number of String objects, then (n/2) +1 elements should be in
// UPPPERCASE

import java.util.Scanner;
import java.util.Arrays;

class StringArrayOrder{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.println("Enter the size of the array:");
		int size = in.nextInt();
		String []input = new String[size+1];
		input = _input(size+1);
		stringArrayOrder(input,size+1);

	}

	public static String[] _input(int size)
	{
		String []input = new String[size];
		System.out.println("Enter the String array:");
		for(int i = 0; i < size; i++)
			input[i] = in.nextLine();
		return input;
	}

	public static void stringArrayOrder(String[] input,int size)
	{
		
		input = sort(input , size);
		int upper = 0;
		if((size % 2) == 0)
			upper = size / 2;
		else
			upper = (size / 2) + 1;
		for(int i = 0; i < upper; i++)
			input[i] = input[i].toUpperCase();
		System.out.println("Updated String Array:");
		for(String ip: input)
			System.out.println(ip);		
	}

	public static String[] sort(String[] input, int size)
	{
		Arrays.sort(input);
		return input;
	} 


}
