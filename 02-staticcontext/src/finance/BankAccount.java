package finance;

public class BankAccount {

	int accountNumber;
	int balanceTotal;
	static String bankName = "SBI";
	static double interestRate = 7.2;

	public BankAccount(int accountNum, int total) {
		this.accountNumber = accountNum;
		this.balanceTotal = total;
	}

	public void printAccount() {
		System.out.println("welcome to " + BankAccount.bankName);
		System.out.println("current loan interest rate" + BankAccount.interestRate);
		System.out.println("AccountNumber: " + this.accountNumber);
		System.out.println("AvailableBalance: " + this.balanceTotal);
		System.out.println("------");
	}

	
}
