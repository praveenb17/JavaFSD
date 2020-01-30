// Program to replace String in SubString

class ReplaceString{
public static void main(String[] args) {
	StringBuffer a= new StringBuffer(args[0]);
	System.out.println(a);
	System.out.println("\n After replace \n\n");
	a.replace(0,10,"I'm Good");
	System.out.println(a);

	}
}

