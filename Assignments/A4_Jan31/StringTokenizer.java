
import java.util.StringTokenizer;

class StringTokenizer{
	public static void main(String[] args) {
		String str = args[0];
		StringTokenizer r = new StringTokenizer(str, " ");
		String num = "";
		int sum = 0;
		while(r.hasMoreTokens())
		{	
			num = r.toString(nextToken());
			System.out.println(num);
			sum += Integer.parseInt(num);
		}
		System.out.println("Sum is: " + sum);
	}
}