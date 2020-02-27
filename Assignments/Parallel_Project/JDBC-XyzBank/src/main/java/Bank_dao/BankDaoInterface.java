package Bank_dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BankDaoInterface {
	
	void createOurStatement(String qry) throws SQLException;
	ResultSet queryTable(String fetchQry, int accNumber) throws SQLException;
	boolean updateTable(String fetchQry, String Name, String accType, int accNumber) throws SQLException;
	boolean _addAccount(String Name, String accType, int accNumber ) throws SQLException;
	int getBalance(int accNumber) throws SQLException;
	

}
