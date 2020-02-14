package Bank_Service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ServiceInteface {
//	public static final String USERACCOUNTPATTERN="[0-9] {5,5}";
	boolean validateAccNumber(Integer accNumber);
//	boolean validateAvailability(int accNumber) ;
	boolean addAccount(String name, String accType, int accNumber);
	public int getB(int accNumber) throws SQLException;
	public boolean accWithdraw(int AccNum,int amount) throws SQLException;
	
}
