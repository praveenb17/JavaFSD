//Sort array elements
import java.util.Scanner;

class SelSort{
	public static void main(String[] args) {
		int []a = new int[5];
		int temp;
		System.out.println("Enter array elements");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < a.length; i++)
		{
			
			a[i] = scan.nextInt();
		}

		System.out.println(" Sorted Elements are: ");

		for(int i = 0; i < a.length-1; i++)
		{
			for(int j = i+1; j < a.length; j++)
				if(a[i] > a[j])
					{
						temp= a[j];
						a[j] = a[i];
						a[i] = temp;
					}
		}

		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}
}