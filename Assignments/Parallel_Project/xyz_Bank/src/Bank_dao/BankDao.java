package Bank_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bank_UI.Exceptions;

public class BankDao {

	static Connection dbCon;
	static PreparedStatement pstmt;
	

	public BankDao() {
		try {
			dbCon = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/xyz_bank?useTimezone=true&serverTimezone=UTC", "root", "");

		} catch (SQLException e) {
			new Exceptions().conException(e);
		}

	}

	public static void createOurStatement(String qry) {
		try {
			pstmt = dbCon.prepareStatement(qry);
		} catch (SQLException e) {
			new Exceptions().statementException(e);
		}
	}

	public static void main(String[] args) {

	}

	private static boolean queryTable(String fetchQry, int accNumber) throws SQLException{

		try {

			createOurStatement(fetchQry);

			pstmt.setInt(1, accNumber);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next())
				return true;
			else
				return false;

		} 

//		 Close the connection
		finally {
			try {
				dbCon.close();
			} catch (SQLException e) {
				new Exceptions().closingConException(e);
			}
		}

	}
	
	private static boolean updateTable(String fetchQry, String Name, String accType, int accNumber) {

		try {

			createOurStatement(fetchQry);

			pstmt.setString(1, Name);
			pstmt.setString(2, accType);
			pstmt.setInt(3, accNumber);

			int a = pstmt.executeUpdate();

			if (a > 0)
				return true;
			else
				return false;

		} catch (SQLException e) {
			new Exceptions().prepException(e);
		}

//		 Close the connection
		finally {
			try {
				dbCon.close();
			} catch (SQLException e) {
				new Exceptions().closingConException(e);
			}
		}
		return false;

	}
	
	public static boolean _addAccount(String Name, String accType, int accNumber ) throws SQLException
	{
			try{String fetchQry = "INSERT INTO passbook VALUES (?,?,?)";
			
			if(updateTable(fetchQry, Name, accType, accNumber))
				return true;
			else
				return false;
			}
//		 Close the connection
		finally {
			try {
				dbCon.close();
			} catch (SQLException e) {
				new Exceptions().closingConException(e);
			}
		}
	}

	public boolean searchAccNumber(int accNumber) throws SQLException {

		String search = "SELECT * FROM PASSBOOK WHERE AccountNumber = ?";
		boolean s = queryTable(search, accNumber);
		return s;
	}

}
