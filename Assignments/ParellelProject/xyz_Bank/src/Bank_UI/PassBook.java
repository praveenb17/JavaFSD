package Bank_UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Bank_Service.BankService;

public class PassBook {
	public static Scanner in = new Scanner(System.in);
	public static BankService service = new BankService();
	private static ResultSet rs;

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank Services\n");
		try {
			customerInput();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void customerInput() throws InputMismatchException, SQLException {
		try {
			System.out.println("Please Choose one among the following options");
			System.out.println("\nEnter 1 for Creating an Acoount" + "\nEnter 2 for Transactions"
					+ "\nEnter 3 to check the Balance" + "\nEnter 4 to QUIT the application \n");

			int response = in.nextInt();

			switch (response) {
			case 1:
				details();
				break;
			case 2:
				transaction();
				break;
			case 3:
				getBalance();
				break;
			case 4:
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

	private static void getBalance() {
		System.out.println("Enter your Accounnt Number");
		int accNumber = in.nextInt();
		try {
			 
			int balance = service.getB(accNumber);
			
				System.out.print("Available Balance in your Account is : ");
			System.out.println(balance);
			customerInput();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private static void transaction() throws SQLException {
		try {

			System.out.println(
					"\nEnter 1 for Deposit" + "\nEnter 2 for Withdraw" + "\nEnter 3 for FT" 
							+ "\nEnter 4 for Knowing previous transaction" + "\nEnter 5 to QUIT the application \n");

			int response = in.nextInt();

			switch (response) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				fundtransfer();
				break;
			default:
				System.out.println("\n Invalid input! Please try again..");
				customerInput();
			}
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}

	}
	private static void fundtransfer() {
		try {
			System.out.println("Enter Your Account Number : ");
			int myacc = in.nextInt();
			
			System.out.println("Enter Recipient Account Number : ");
			int otheracc = in.nextInt();
			
			System.out.println("Enter the Amount you Want to Transfer : ");
			int amount = in.nextInt();
			
			boolean x = service.accWithdraw(myacc, amount);
			boolean z;
			if(x)
			{
				 z = service.newDeposit(otheracc, amount);
				 if(z)
					 System.out.println("Fund Transfer is Successful...");
				 else
					 System.out.println("Fund Transfer is Unsuccessful!!!!");
			}
			else
			{
				System.out.println("Amount Transfer is UnsuccesFull!!!!!");
			}
				
			
		}
		catch(SQLException e)
		{
			System.out.println("");
		}
	}
	

	private static void withdraw() {

		try {
			// Yet to be defined
			System.out.println("Enter Your Account Number : ");
			int acc = in.nextInt();
			
			System.out.println("Enter the Amount You Want to Withdraw : ");
			int amount = in.nextInt();
			
			boolean x;
			x = service.accWithdraw(acc, amount);
			if (x) 
			{
				System.out.println("Amount is Withdrawn succcessfully");
				customerInput();
			} 
			else 
			{
				System.out.println("Server Down1234!... couldn't deposit the amount, try agin later");
				customerInput();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private static void deposit() throws SQLException {
		System.out.println("Enter your Account number");
		int aNumber = in.nextInt();

		System.out.println("Enter the amount to deposit");
		int amount = in.nextInt();

		boolean x =service.newDeposit(aNumber, amount);
		if (x) 
		{
			System.out.println("Amount is deposited succcessfully");
			customerInput();
		} 
		else 
		{
			System.out.println("Server Down1234!... couldn't deposit the amount, try agin later");
			customerInput();
		}

	}
	

	private static void details() throws InputMismatchException, SQLException {
		try {
			in.nextLine();
			System.out.println("Enter your Full Name: \n");
			String name = in.nextLine();
			System.out.println("Enter the accont type(Savings,Current,...) :");
			String accType = in.nextLine();
			System.out.println("Enter your account number \n");
			int accNumber = in.nextInt();
//			int accNumber = newAccNumber();
			if (service.addAccount(name, accType, accNumber))
				System.out.println("Account is created");
			else
				System.out.println("Server Down!!!");
			menu();
		} catch (InputMismatchException ie) {
			new Exceptions().inException(ie);
		}
	}

	private static void menu() throws InputMismatchException, SQLException {
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



}
