
public class Main {

	public static void main(String[] args) {
		MoneyMarket moneyMarket = new MoneyMarket(2500);
		Individual indi = new Individual(3200);
		Savings savings = new Savings (500);
		
		//Test Deposit
		moneyMarket.deposit(300);
		System.out.println(moneyMarket.getBalance());
		//Test Withdrawel 
		System.out.println("You were able to withdraw "+moneyMarket.withdrawel(3000)+" from Money Market account");
		System.out.println("You were able to withdraw "+moneyMarket.withdrawel(999)+" from Money Market account");
		
		//Test Deposit
		indi.deposit(800);
		System.out.println(indi.getBalance());
		//Test Withdrawel 
		System.out.println("You were able to withdraw "+indi.withdrawel(1500)+" from Individual account");
		System.out.println("You were able to withdraw "+indi.withdrawel(500)+" from Individual account");
		
		//Test Deposit
		savings.deposit(100);
		System.out.println(savings.getBalance());
		//Test Withdrawel 
		System.out.println("You were able to withdraw "+savings.withdrawel(2000)+" from Savings account");
		System.out.println("You were able to withdraw "+savings.withdrawel(700)+" from Savings account");
		System.out.println("You were able to withdraw "+savings.withdrawel(599)+" from Savings account");
		
		savings.transfer(100, savings, indi);
		System.out.println("New balance in Savings is: "+savings.getBalance());
		System.out.println("New balance in Individual account is " + indi.getBalance());
	}

}
