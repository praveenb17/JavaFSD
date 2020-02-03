// Write a Java program that prompts the user for an integer and then prints out all the prime
// numbers up to that Integer
import java.util.Scanner;

class NPrimeNumbers{
	public static void main(String[] args) {
		int n = _input();
		nPrimeNumbers(n);
	}

	public static int _input()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		return n;
	}

	public static void nPrimeNumbers(int n)
	{
	
       String  primeNumbers = "";

       for (int i = 1; i <= n; i++)         
       { 		  	  
	        int counter=0; 	  
	        for(int num = i; num >= 1; num--)
		  	{
	            if(i % num == 0)
			    {
		 			counter = counter + 1;
			    }
		  	}

			 if (counter == 2)
			 {
			    primeNumbers = primeNumbers + i + " "; // Storing them as string characters
			 }	
       	}	

       System.out.println("Prime numbers from 1 to " + n + " are :");
       System.out.println(primeNumbers);
	}
}