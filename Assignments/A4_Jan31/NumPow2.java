// Program to check whether the given number is power of 2 or not
import java.util.Scanner;

class NumPow2{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		if(numPow2(number))
			System.out.println("Number is power of 2");
		else
			System.out.println("Number is not a power of two");
	}

	public static boolean numPow2(int number)
	{
		if(number == 0)
			return true;
		int count = countSetBits(number);
		if(count == 1)
			return true;
		else 
			return false;

	}

	public static int countSetBits(int number)
	{
		int count = 0;
		while(number > 0)
		{
			if((number & 1 )== 1)
				count++;

			number = number>>1;
			
		}
		return count;
	}
}