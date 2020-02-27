package Bank_Service;

public interface ServiceInterface {

	int checkBal(int accNum, String Name);
	boolean withdraw(int accNum, int amount);
	boolean deposit(int accNum, int amount);
	boolean fundTransfer(int sender, int reciepent, int amount);
	
}


