package Bank_Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import Bank_dao.BankDao;

public class BankService implements ServiceInteface {
	public static BankDao b = new BankDao();
	@Override
	public boolean validateAccNumber(Integer accNumber) {
		String len = accNumber.toString();
		if (len.length() == 5)
			return true;
		else
			return false;

	}

	public boolean addAccount(String name, String accType, int accNumber) {
		
		try {
			boolean a = new BankDao()._addAccount(name, accType, accNumber);
			return a;
		} catch (SQLException e) {
			System.out.println("Server Down!! account is not created, try again!!" + e.getMessage());
		}
		return false;
	}

	public boolean newDeposit(int accNumber, int amount)throws SQLException {
		
		int oldBal = 0;
		oldBal = b.getBalance(accNumber);
		
		amount = oldBal + amount;
		
		String depQry = "update passbook set Balance="+"'"+amount+"'"+"where AccountNumber="+"'"+accNumber+"'";

       boolean y = b.accountUpdate(depQry, accNumber);
       
     return y;

	}

	public int getB(int accNumber) throws SQLException {
		
		return b.getBalance(accNumber);
	}
	
	public boolean accWithdraw(int AccNum,int amount) throws SQLException
	{
		int Bal = 0;
	
		Bal = b.getBalance(AccNum);
		
		if(Bal >= amount)
		{
		
		Bal = Bal - amount;
		
		String depQry = "update passbook set Balance="+"'"+Bal+"'"+"where AccountNumber="+"'"+AccNum+"'";

       boolean y = b.accountUpdate(depQry, AccNum);
       
     return y;
		
		
		}
		else
			return false;
		
	}

}
