package bs;

public class Account {
	
	private  String ID;
	private  double balance; //mandatory
	
	
	public Account(String id, double intial) {
		this.ID= id;
		this.balance=intial;
	}
		
	public double getBalance() {
		return this.balance;
	}
	
	//deposit feature
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(" Amount: "+ amount +" added to the account: "+ID +"\n Total "+ getBalance()+amount);
	}
		
	
	//withdraw without limit
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			return true;
		}	
		return false;
	}
	

	
}
