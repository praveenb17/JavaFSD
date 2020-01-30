//Program to check given string is palindrome or not

class StringPalindrome{
	public static void main(String[] args) {
		// StringBuffer a = new StringBuffer(args[0]);
		// String b = a.toString();

		// String c = b.reverse();
		// //a = a.reverse();

		StringBuffer a = new StringBuffer(args[0]);
		int d = 0;
		StringBuffer b = a;
		StringBuffer c = a.reverse();
       for(int i = 0; i < b.length(); i++){
       		if(b.charAt(i) == c.charAt(i))
       			d++;
       }

		if(d == b.length())
			System.out.println("String " + b + " is a palindrome" );
		else
			System.out.println("String " + b + " is not a palindrome" );
 }

}