// Program to find whether character exist in string or not

class SearchCharacter{
public static void main(String[] args) {
	StringBuffer a = new StringBuffer(args[0]);
	StringBuffer b = new StringBuffer(args[1]);
	int c = 0;
	for (int i = 0; i < a.length(); i++ ) {
		if(a.charAt(i) == b.charAt(0)){
			System.out.println(" Character found in the string");
			c = 1;
		}

		}
		if(c == 0)
			System.out.println(" Character not found");
}

}