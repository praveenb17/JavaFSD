
import java.util.Scanner;

class TrafficLight{
	public static void main(String[] args) {
		_input();
	}
	public static void _input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the color name to Choose between lights : red, yellow and green");
		String button = in.nextLine();

		switch(button)
		{
			case "red":
				System.out.println("stop");
				break;

			case "yellow":
				System.out.println("ready");
				break;

			case "green":
				System.out.println("go");
				break;

			default:
				System.out.println("you should Wait until you choose the right color");
		}
	}
}
