import java.util.concurrent.ThreadLocalRandom;
public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	private static int howManyAccts;
	private static Double totalBalance;
	
	public BankAccount(Double checkingBalance,Double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		
		accountNumber = setAccountNum();
		totalBalance = setTotalBalance();
		howManyAccts++;
	}
	
	private String setAccountNum() {
			String newAcct = "";

        for(int i =0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,9);
        	newAcct += randomNum;
        }
        return newAcct;
	}
	
	private Double setTotalBalance() {
		totalBalance += this.getCheckingBalance() + this.getSavingsBalance();
		return totalBalance;
	}
	
	private Double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	private Double getSavingsBalance() {
		return this.savingsBalance;

	}
	
	private void setSavingsBalance(Double money) {
		this.savingsBalance = money;

	}
	
	private void setCheckingBalance(Double money) {
		this.checkingBalance = money;

	}
	
	public void deposit(Double checking) {
		this.setCheckingBalance(this.getCheckingBalance()+checking);
		totalBalance+=checking;
	}
	
	public void deposit(Double checking,Double savings) {
		this.setCheckingBalance(this.getCheckingBalance()+checking);
		this.setSavingsBalance(this.getSavingsBalance()+savings);
		totalBalance+=(checking+savings);
	}
	
	public void withdraw(Double checking) {
		if(this.getCheckingBalance() >= checking) {
			this.setCheckingBalance(this.getCheckingBalance() - checking);
		}else {
			System.out.println("YOU DO NOT HAVE ENOUGH MONEY!!!");
		}
	}
	
	public void withdraw(Double checking,Double savings) {
		if(this.getCheckingBalance() >= checking) {
			this.setCheckingBalance(this.getCheckingBalance() - checking);
		}else if(this.getSavingsBalance() >= savings) {
			this.setSavingsBalance(this.getSavingsBalance() - savings);
		}else {
			System.out.println("YOU DO NOT HAVE ENOUGH MONEY!!!");
		}
	}
	
	public Double getTotalBalance() {
		return totalBalance;
	}
	
}
