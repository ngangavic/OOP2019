package bank;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount(101);
		System.out.println("Deposting $500...");
		checkingAccount.deposit(500.00);
		System.out.println("Deposting $1000...");
		checkingAccount.deposit(1000.00);
		//System.out.println("Withdraw $1600...");
		//checkingAccount.withdraw(1600.00);
		//System.out.println("The balance is: "+checkingAccount.getBalance());
		try {
			System.out.println("\nWithdrawing $100...");
			checkingAccount.withdraw(100.00);
			System.out.println("\nWithdrawing $600...");
			checkingAccount.withdraw(600.00);
			System.out.println("\nWithdrawing $1000...");
			checkingAccount.withdraw(1000.00);
		} catch (InsufficientFundsException e) {
			//e.printStackTrace();
			System.err.println("Sorry,but you are short $"+e.getAmount());
		}
		finally {
			System.out.println("You current balance is $"+checkingAccount.getBalance());
		}
	}
}