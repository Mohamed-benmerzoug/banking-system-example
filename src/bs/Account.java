package bs;

public class Account {
	
	private  String ID;
	private  double balance; //mandatory
	private  String currencyExchange; //currencyExchange feature
	private double limit; //limit on account.
	
	
	public Account(String id, double intial) {
		this.ID= id;
		this.balance=intial;
	}
	
	public void getCurrency(){
		return this.currencyExchange;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setLimit(double limit) {
		this.limitOnAccount = limit;
	}
	
	public double getLimit() {
		return limitOnAccount;
	}
	
	//deposit feature
	public void deposit(double amount) {
		balance +=amount;
		displayTransactionInfo(amount);
	}
	
	public void displayTransactionInfo(double amount) {
		System.out.println(" Amount: "+ amount +" added to the account: "+custumerID +"\n Total "+ getBalance()+amount);
	}
	
	//withdraw with limit
	public boolean withdraw(double amount) {
		if(balance >= amount + limit) {
			balance = balance - amount;
			return true;
		}	
		return false;
	}
	

	
}
