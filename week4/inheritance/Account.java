package week4.inheritance;

import java.util.Date;

public class Account 
{
	private long accountNo;
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", dob=" + dob + ", balance=" + balance + "]";
	}

	private String  name;
	private String address;
	private long phoneNo;
	private Date dob;
	private double balance;
	private double fdBalance;
	private double loanAmount;
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getFdBalance() {
		return fdBalance;
	}
	public void setFdBalance(double fdBalance) {
		this.fdBalance = fdBalance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(long accountNo, String name, String address, long phoneNo, Date dob, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.balance = balance;
	}
	
	public void closeAccount()
	{
		this.balance=0;
		System.out.println("Your Account is Closed");
	}
	
}