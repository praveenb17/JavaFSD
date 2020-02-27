package Bank_Service;

import com.ibm.training.JDBC_XyzBank.BankDao;

public class BankService implements ServiceInterface{

	BankDao dao;
	public int checkBal(int accNum, String Name) {
		
		
		return dao.getBalance(accNum);
		// TODO Auto-generated method stub
		
	}

	public boolean withdraw(int accNum, int amount) {
		dao.
		return false;
	}

	public boolean deposit(int accNum, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean fundTransfer(int sender, int reciepent, int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
