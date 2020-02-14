package Bank_UI;

import java.util.InputMismatchException;
import java.util.Scanner;

import Bank_Service.BankService;

public class PassBook {
	public static Scanner in = new Scanner(System.in);
	public static BankService service = new BankService();

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank Services\n");
		customerInput();
	}

	private static void customerInput() throws InputMismatchException{
		try {
			System.out.println("Please Choose one among the following options");
			System.out.println("\nEnter 1 for Creating an Acoount" + "\nEnter 2 for Transactions"
					+ "\nEnter 3 to QUIT the application \n");
			int response = in.nextInt();

			switch (response) {
			case 1:
				details();
				break;
			case 2:
				transaction();
				break;
			case 3:
				System.out.println("\n Thanks for using XYZ Bank Services.. Have a nice Day :)  ");
				break;
			default:
				System.out.println("\n Invalid input! Please try again..");
				customerInput();
			}
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}

	}

	private static void transaction() {
		try {

			System.out.println("\nEnter 1 for Deposit" + "\nEnter 2 for Withdraw"
					+ "\nEnter 3 for FT" + "\nEnter 4 for Withdraw"
					+ "\nEnter 5 for Knowing previous transaction"
					+ "\nEnter 6 to QUIT the application \n");
			int response = in.nextInt();

			switch (response) {
			case 1:
				deposit();
				break;
			case 2:
				new BankService().newTransaction();
				break;
			case 3:
				System.out.println("\n Thanks for using XYZ Bank Services.. Have a nice Day :)  ");
				break;
			default:
				System.out.println("\n Invalid input! Please try again..");
				customerInput();
			}
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}


	}
	private static void deposit() {
		System.out.println("Enter your Account number");
		String anumber = 
		
	}
	}

	private static void details() throws InputMismatchException {
		try {
			in.nextLine();
			System.out.println("Enter your Full Name: \n");
			String name = in.nextLine();
			System.out.println("Enter the accont type(Savings,Current,...) :");
			String accType = in.nextLine();
			int  accNumber = newAccNumber();
			if (service.addAccount(name, accType, accNumber))
				System.out.println("Account is created");
			else
				System.out.println("Server Down!!!");
			menu();
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}
	}

	private static void menu() throws InputMismatchException {
		try {
	
			System.out.println("\nEnter 1 for Creating another Acoount" + "\nEnter 2 main MENU"
					+ "\nEnter 3 to QUIT the application \n");
			int response = in.nextInt();

			switch (response) {
			case 1:
				details();
				break;
			case 2:
				customerInput();
				break;
			case 3:
				System.out.println("\n Thanks for using XYZ Bank Services.. Have a nice Day :)  ");
				break;
			default:
				System.out.println("\n Invalid input! Please try again..");
			}
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}

	}

	@SuppressWarnings("unused")
	private static int newAccNumber() {
		System.out.println("Enter your account number that you want(5 digits) ");
		int accNumber = in.nextInt();
		boolean v = service.validateAccNumber(accNumber);
		if (v) {
			boolean a = service.validateAvailability(accNumber);
			if (a)
				System.out.println("Account Number is Generated");
			else {
				System.out.println("Account number is taken, please try different number");
				newAccNumber();
			}
		} else {
			System.out.println("Please enter 5 digits number");
			newAccNumber();
		}
		return accNumber;

	}

}
