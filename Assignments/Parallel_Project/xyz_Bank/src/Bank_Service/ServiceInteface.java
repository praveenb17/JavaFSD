package Bank_Service;

public interface ServiceInteface {
//	public static final String USERACCOUNTPATTERN="[0-9] {5,5}";
	boolean validateAccNumber(Integer accNumber);
	boolean validateAvailability(int accNumber) ;
	boolean addAccount(String name, String accType, int accNumber);
	void newTransaction();
}
