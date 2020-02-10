// Java program that reads a file and displays the file on the screen, with a line
// number before each line

import java.io.*;

class readDisplayFile{
	public static void main(String[] args) {
	try{
		File file = new File("q1.txt");
		StringBuilder sb = new StringBuilder("q1.txt");
		int i = 1;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while((str = br.readLine()) != null)
		{
			sb.append(str + "\n");
			System.out.println(i + " " +str);
			i++;
		}
	}
	catch(IOException e) {System.out.println("Can't read from the file currently..."); }
}

}
