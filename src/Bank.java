
public class Bank {
	
	double balance;
	String accountType;
	private static int withdrawLimit = 1000;
	
	public Bank( double balance, String accountType) {
		this.balance = balance;
		this.accountType = accountType;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		
		public void deposit(double amount){
			balance = balance+amount;			
		}
		
		public double withdrawel(double amount) {
			if (amount <= withdrawLimit && amount <= balance) {
				setBalance(getBalance()-amount);
				return amount;
			}
			else {
				return 0;
			}
		}
		
		public void transfer(double amount, Bank acctFrom, Bank acctTo) {
			if(acctFrom.getBalance() >= amount) {
				acctFrom.setBalance(acctFrom.getBalance()-amount);
				acctTo.setBalance(acctTo.getBalance()+amount);
			}
		}	

}
