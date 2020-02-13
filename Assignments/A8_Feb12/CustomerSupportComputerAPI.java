package support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerSupportComputerAPI {
	public static int iDNumber = 2;
	public static Scanner in = new Scanner(System.in);
	public static List list = new java.util.ArrayList();

	public static void main(String[] args) {

		System.out.println("Welcome to Customer Support Service.. \n How may I help you?");
		try {
			Connection dbCon = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/customersupport?useTimezone=true&serverTimezone=UTC", "root", "");
			customerService(dbCon);
		} catch (SQLException e) {
			System.out.println("Connection Failed: " + e.getMessage());
		}

	}

	public static void customerService(Connection dbCon) {

		System.out.println(" \n Please Enter 1 for : Adding a new Computer");
		System.out.println(" Please Enter 2 for : Displaying available Computers");
		System.out.println(" Please Enter 3 for : Searching a Computer");
		System.out.println(" Please Enter 4 for : Deleting a Computer");
		System.out.println(" Please Enter 5 for : Updating Computer details");
		int responseNumber = in.nextInt();

		switch (responseNumber) {
		case 1:
			System.out.println("You are adding a new Computer\n");
			addNewComputer(dbCon);
			break;
		case 2:
			System.out.println("Available Computers are: \n");
			displayAllComputers(dbCon);
			break;
		case 3:
			System.out.println("Searching a computer........\n");
			searchComputer(dbCon);
			break;
		case 4:
			System.out.println("Deleting a Computer!!..........\n");
			deleteComputer(dbCon);
			break;
		case 5:
			System.out.println("Updating Computer details...........\n");
			// updateComputer();
			break;
		default:
			System.out.println(
					"Invalid response.. \n Thanks for using Customer Support Serivce.. \n Try agin someother time!!");

		}

	}

	public static void addNewComputer(Connection dbCon) throws InputMismatchException {

		String brand;
		String color;
		int hddSize = 0;

		try {
			in.nextLine();
			System.out.println("Enter Brand name:");
			brand = in.next();
			in.nextLine();

			System.out.println("Enter color name:");
			color = in.nextLine();
			System.out.println("Enter hddSize:");
			hddSize = in.nextInt();

			in.nextLine();

			Statement stmt = dbCon.createStatement();
			String queryName = "insert into computerstore values " + "(" + "'" + brand + "'" + "," + iDNumber + ",'"
					+ color + "'," + hddSize + ")";
			stmt.executeUpdate(queryName);

			iDNumber++;

		} catch (InputMismatchException ie) {
			System.out.println("Invalid input, try again.");
			addNewComputer(dbCon);
		} catch (SQLException e) {
			System.out.println("Creating Statement failed: " + e.getMessage());
		}

		System.out.println("\n Computer is successsfully added!!");
		System.out.println("\n Enter 1 to add new computer" + "\n Enter 2 to display all the computers"
				+ "\n Enter 3 To return into main MENU" + "\n Enter 4 to close the Service");

		int response = in.nextInt();
		switch (response) {
		case 1:
			addNewComputer(dbCon);
			break;

		case 2:
			displayAllComputers(dbCon);
			break;

		case 3:
			customerService(dbCon);
			break;

		case 4:
			System.out.println("Thanks for using the Service");
			break;

		default:
			System.out.println(
					"Unexpected Error!!\nThanks for using Customer Support Serivce.. Try agin someother time!!");

		}

	}
	
	

	public static void _response(Connection dbCon) {
		in.nextLine();
		System.out.println("\n Enter MENU To return into main MENU" + "\n Enter QUIT to close the Service");
		
		String response = in.nextLine();

		switch (response) {
		case "MENU":
			customerService(dbCon);
			break;

		case "QUIT":
			System.out.println("Thanks for using the Service");
			break;

		default:
			System.out.println("\nThank you!!");
		}
	}
	
	

	public static void displayAllComputers(Connection dbCon) {

		try {

			Statement stmt = dbCon.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM `computerstore` ");
			while (rs.next()) {
				System.out.print("Computer: " + rs.getString("Brand"));
				System.out.println(", Model Number : " + rs.getInt("ModelNumber"));
				System.out.println(", with color : " + rs.getString("Color"));
				System.out.println(", Harddisk size : " + rs.getInt("hddSize"));
				System.out.println("\n");
			}
			in.nextLine();
			_response(dbCon);

		} catch (SQLException e) {
			System.out.println("Failed in displaying the computers : " + e.getMessage());
		}
		
	}

	public static void searchComputer(Connection dbCon) {
		System.out.println("Enter 1: For searching by model number " + "\nEnter 2: For searching by brand"
				+ "\nEnter 3: For searching by color" + "\nEnter 4: For searching by hddSize"
				);
		in.nextLine();

		int r = in.nextInt();

		switch (r) {
		case 1:
			try {
				System.out.println("Enter the model number");
				int m = in.nextInt();

				Statement stmt = dbCon.createStatement();
				String q = "SELECT * FROM `computerstore` where ModelNumber = " + "'" + m + "'";
				ResultSet rs = stmt.executeQuery(q);
				if(rs.next()) {
					System.out.print("Computer: " + rs.getString("Brand"));
					System.out.println(", Model Number : " + rs.getInt("ModelNumber"));
					System.out.println(", with color : " + rs.getString("Color"));
					System.out.println(", Harddisk size : " + rs.getInt("hddSize"));
					System.out.println("\n");
				}
				else
					System.out.println("Computer not found");
				in.nextLine();
				_response(dbCon);

			} catch (SQLException e) {
				System.out.println("Failed in displaying the computers : " + e.getMessage());
			}
			break;
		case 2:
			try {

				System.out.println("Enter the Brand Name");
				String b = in.nextLine();

				Statement stmt = dbCon.createStatement();
				String q = "SELECT * FROM `computerstore` where ModelNumber = " + "'" + b + "'";

				ResultSet rs = stmt.executeQuery(q);
				if(rs.next()) {
					System.out.print("Computer: " + rs.getString("Brand"));
					System.out.println(", Model Number : " + rs.getInt("ModelNumber"));
					System.out.println(", with color : " + rs.getString("Color"));
					System.out.println(", Harddisk size : " + rs.getInt("hddSize"));
					System.out.println("\n");
				}
				else
					System.out.println("Computer not found");
				in.nextLine();
				_response(dbCon);

			} catch (SQLException e) {
				System.out.println("Failed in displaying the computers : " + e.getMessage());
			}
			
			break;
		case 3:
			try {

				Statement stmt = dbCon.createStatement();
				System.out.println("Enter the model color");
				String c = in.nextLine();

				
				String q = "SELECT * FROM `computerstore` where ModelNumber = " + "'" + c + "'";
				ResultSet rs = stmt.executeQuery(q);
				if(rs.next()) {
					System.out.print("Computer: " + rs.getString("Brand"));
					System.out.println(", Model Number : " + rs.getInt("ModelNumber"));
					System.out.println(", with color : " + rs.getString("Color"));
					System.out.println(", Harddisk size : " + rs.getInt("hddSize"));
					System.out.println("\n");
				}
				else
					System.out.println("Computer not found");
				in.nextLine();
				_response(dbCon);

			} catch (SQLException e) {
				System.out.println("Failed in displaying the computers : " + e.getMessage());
			}
			
			break;
		case 4:
			try {

				Statement stmt = dbCon.createStatement();
				System.out.println("Enter the hdd size");
				int s = in.nextInt();

	
				String q = "SELECT * FROM `computerstore` where ModelNumber = " + "'" + s + "'";
				ResultSet rs = stmt.executeQuery(q);
				if(rs.next()) {
					System.out.print("Computer: " + rs.getString("Brand"));
					System.out.println(", Model Number : " + rs.getInt("ModelNumber"));
					System.out.println(", with color : " + rs.getString("Color"));
					System.out.println(", Harddisk size : " + rs.getInt("hddSize"));
					System.out.println("\n");
				}
				else
					System.out.println("Computer not found");
				in.nextLine();
				_response(dbCon);

			} catch (SQLException e) {
				System.out.println("Failed in displaying the computers : " + e.getMessage());
			}
			break;
		
		default: {
			System.out.println("Invalid response.. \n Try again someother time!!");
			in.nextLine();
			_response(dbCon);
		}

		}

	}

	public static void deleteComputer(Connection dbCon) {
		System.out.println("Are you sure want to delete a computer??\n Confirm by entering 1");
		int confirm = in.nextInt();
		
			try {
				if (confirm == 1) {
					System.out.println("Enter the id number you want to delete: ");
					int iD = in.nextInt();
					String queryName = "DELETE FROM `computerstore` WHERE ModelNumber = " + "'" + iD + "'";
					Statement stmt = dbCon.createStatement();
					stmt.executeUpdate(queryName);
					
					System.out.println("Computer is successsfully deleted..");
					in.next();
					_response(dbCon);
					
				} else {
					System.out.println("\n Thank you");
					_response(dbCon);
				}

			} catch (SQLException e) {
				System.out.println("Failed in deleting the computer " + e.getMessage());
			}


	}
}
