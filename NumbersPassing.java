class NumbersPassing{
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		if( a < 40 )
			{
				System.out.println("Failing"); 
				return;
			}

		int b = Integer.parseInt(args[1]);
		if(b < 40)
			{
				System.out.println("Failing"); 
				return;
			}

		int  c = Integer.parseInt(args[2]);

		if(c < 40)
			{
				System.out.println("Failing"); 
				return;
			}

		int sum = a + b + c;

		if(sum > 125)
			system.out.println("Passing");
		else
			System.out.println("Failing");


	}
}