
// Java program that displays the number of characters, lines and words in a
// text read from a file


import java.io.*;
class wordsCount{
	public static void main(String[] args) {
		int i = 0, w = 1, c = 0;
		String str = " ";
		try{
		File file = new File("q1.txt");
		StringBuilder sb = new StringBuilder("q1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((str = br.readLine()) != null)
		{
			sb.append(str);
			i++;
		}
		c = sb.length();

		for(int j = 0; j < c; j++)
			{
				if(sb.charAt(j) == '\n' || sb.charAt(j) == ' ' )
					w++;
			}
		
	}
	catch(IOException e) {System.out.println("Can't read from the file currently..."); }
	catch(NullPointerException n) {System.out.println("Can't read from the file currently...");
	 }
	System.out.println("Number of characters in the file are : " + c);
	System.out.println("Number of lines in the file are : " + i );
	System.out.println("Number of words in the file are: " + w);

	}
 
}

