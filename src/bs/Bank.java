package bs;

public class Bank {
	
	Account account;
	
	public void createAccount(String id, double balance) {		
			 account=new Account(id, balance);
			 System.out.println("Account: "+ id +" has been created succesfuly ...");
	}
	
	public void depositOnAccount(String id, double amount) {	
		account.deposit(amount);
	}
	
	public void withdrawFromAccount(String id, double amount) {
		if (account.withdraw(amount)) {
			System.out.println("the ammount "+ amount +" has been withdraw successfuly ...");
		}
		else {
			System.out.println("Error insufficientBalance...!");

		}
	}
	
}
