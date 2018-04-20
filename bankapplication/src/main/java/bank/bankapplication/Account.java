package bank.bankapplication;

public class Account {
	private Money balance;
	private InterestRate interestRate;
	private Period interestPeriod;
	public Money getBalance() {
		return balance;
	}
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	public InterestRate getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}
	public Period getInterestPeriod() {
		return interestPeriod;
	}
	public void setInterestPeriod(Period interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
public Account() {
	// TODO Auto-generated constructor stub
}
}
