package bank;

import javax.naming.InsufficientResourcesException;

public class CheckingAccount {

	private double balance;
	private final int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (balance >= amount) {
			balance -= amount;
		}else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	
}
