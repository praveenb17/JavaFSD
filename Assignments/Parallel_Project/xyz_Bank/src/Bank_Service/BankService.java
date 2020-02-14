package Bank_Service;

import java.sql.SQLException;

import Bank_dao.BankDao;

public class BankService implements ServiceInteface {

	@Override
	public boolean validateAccNumber(Integer accNumber) {
		String len = accNumber.toString();
		if (len.length() == 5)
			return true;
		else
			return false;

	}

	@Override
	public boolean validateAvailability(int accNumber) {
		boolean a = false;
		try {
			a = new BankDao().searchAccNumber(accNumber);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}



	@Override
	public boolean addAccount(String name, String accType, int accNumber) {
		boolean a = false;
		try {
			new BankDao();
			a = BankDao._addAccount(name, accType, accNumber );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public void newTransaction() {

	}

	

}
