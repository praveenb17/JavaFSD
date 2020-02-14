package Bank_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bank_UI.Exceptions;

public class BankDao implements BankDaoInterface {

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

	public void createOurStatement(String qry) {
		try {
			pstmt = dbCon.prepareStatement(qry);
		} catch (SQLException e) {
			new Exceptions().statementException(e);
		}
	}

	public ResultSet queryTable(String fetchQry, int accNumber) throws SQLException {

		createOurStatement(fetchQry);

	//	pstmt.setInt(1, accNumber);

		ResultSet rs = pstmt.executeQuery();

		return rs;



	}
	public boolean accountUpdate(String qry, int Accnum)
	{
		try {
		createOurStatement(qry);
		
		int h =pstmt.executeUpdate();
		if(h>0)
			return true;
		else
			return false;
	}
		catch (SQLException e) {
			new Exceptions().prepException(e);
		}

		
		return false;

	}
		

	public boolean updateTable(String fetchQry, String Name, String accType, int accNumber) {

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

		
		return false;

	}

	public boolean _addAccount(String Name, String accType, int accNumber) throws SQLException {
		
			String fetchQry = "INSERT INTO passbook VALUES (?,?,?,0.00)";

			if (updateTable(fetchQry, Name, accType, accNumber))
				return true;
			else
				return false;
		
		

		
	}

	public int getBalance(int accNumber) throws SQLException {

		String search = "SELECT Balance FROM PASSBOOK WHERE AccountNumber ="+"'"+accNumber+"'";
		ResultSet rs = queryTable(search, accNumber);
		int x=0;
		while(rs.next())
		{
			x = rs.getInt("Balance");
		}
		return x;
	}

}
