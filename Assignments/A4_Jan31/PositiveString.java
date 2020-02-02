//Check for positive string

import java.util.Scanner;
class PositiveString{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		String b = a.nextLine();

		boolean ab = PositiveString1(b);
		if(ab == true)
			System.out.println(" Not a Positive String");
		else
			System.out.println("Positive String");			
	}

	public static boolean PositiveString1(String b)
	{
		for(int i = 0; i < b.length()-1; i++)
			if((int)b.charAt(i) > (int)b.charAt(i+1))
					return false;
		return true;
	}
}