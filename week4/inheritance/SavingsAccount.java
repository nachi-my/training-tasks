package week4.inheritance;

import java.util.Date;

public class SavingsAccount extends Account {

	public SavingsAccount(long accountNo, String name, String address, long phoneNo, Date dob, double balance) {
		super(accountNo, name, address, phoneNo, dob, balance);
	}

	public void withdraw(double Amount) {
		if (super.getBalance() - Amount < 0) {
			System.out.println("Available Balance = " + super.getBalance());
			System.out.println("You don't have eough amount" + super.getBalance());
			

		} else {
			double availableBalance = super.getBalance();
			availableBalance -= Amount;
			super.setBalance(availableBalance);
			System.out.println(Amount + " withdraw successfully.");
			System.out.println("Available Balance = " + super.getBalance());

		}
	}

	public void deposit(double Amount) {
		double availableBalance = super.getBalance();
		availableBalance += Amount;
		super.setBalance(availableBalance);
		System.out.println(Amount + " deposit successfully.");
		System.out.println("Available Balance = " + super.getBalance());
	}

	public void fixedDeposit() {
		System.out.println("Your current Fixed Deposit amount =" + super.getFdBalance());
	}
}