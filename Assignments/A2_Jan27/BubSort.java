
import java.util.Scanner;

class BubSort{
	public static void main(String[] args) {
		int []a = new int[5];
		int temp;
		System.out.println("Enter Array Elements: ");
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < a.length; i++)
		{
			
			a[i] = s.nextInt();

		}

		

		int c = a.length;
		for(int j = 0; j < c; j++)
			{
				for (int i = 0; i < c-1; i++ ) 
					{
						if(a[i] > a[i+1])
						{
							temp = a[i];
							a[i] = a[i+1];
							a[i+1] = temp;
						}
					}
					c--;
			}
				
			System.out.println("sorted Array Elements are: ");
			for(int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
	}
