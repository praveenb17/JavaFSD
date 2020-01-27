// program to search anumber in runtime for the user inputs

import java.util.Scanner;

class SearchNum{
	public static void main(String[] args) {
		
		int []a = new int[10];
		int b;
		int c = 0;
		System.out.println("Enter array elemnts");

		for(int i = 0; i < a.length; i++){
			Scanner	scan = new Scanner(System.in);

			a[i] = scan.nextInt();

		}

		System.out.println("Enter a number to search");

		Scanner	scan = new Scanner(System.in);
		b = scan.nextInt();
			
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] == b)
				{
					System.out.println("Number is found in the array");
					c = 1;
					break;
				}
		}
		if(c == 0)
			System.out.println("Number not found");

	}
}