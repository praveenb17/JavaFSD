package Bank_UI;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class Exceptions extends Exception{

	public void conException(SQLException e) {
		System.out.println("Connection Failed : " + e.getMessage());
	}

	public void closingConException(SQLException e) {
		System.out.println("Log out error |Issues while closing the connection : " + e.getMessage());
	}

	public void prepException(SQLException e) {
		System.out.println("Issues while creating the prepared statement : " + e.getMessage());
	}

	public void inException(InputMismatchException e) {
		System.out.println("Wrong input : " + e.getMessage());

	}
	public void statementException(SQLException e) 
	{
		System.out.println("Some issues in creating statement" + e.getMessage());
	}

}
