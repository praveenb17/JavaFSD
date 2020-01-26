
class BinaryEquavalent{
	public static void main(String[] args) {
		int b = Integer.parseInt(args[0]);

		for( ; b < 0 ; )
		{
	
			if(b % 2 == 1)
				System.out.print("1");
			else
				System.out.print("0");
			b = b/2;

		}
	}
}