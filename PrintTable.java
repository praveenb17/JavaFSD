class PrintTable{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int l = Integer.parseInt(args[1]);
		int res = num;

		for(int i = 1;i <= l; i++)
		{
			res *= i;
			System.out.println(num + " * " + i + " = " + res);
		}
	}
}