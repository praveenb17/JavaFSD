class FactorialOfNum{
	public static void main(String[] args) {
	
		int a=Integer.parseInt(string[0]);

		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}

		System.out.println("Factorial of a number" + a + "is :" + fact);

	}
}
