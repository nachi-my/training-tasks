package inheritance;

import java.util.Date;

public class LoanAccount extends Account {

	public LoanAccount(long accountNo, String name, String address, long phoneNo, Date dob, double balance) {
		super(accountNo, name, address, phoneNo, dob, balance);
	}

	public void payEMI(double Amount)
	{
		if((super.getLoanAmount()-Amount)<=0)
		{
			System.out.println(" Your Loan is paid ");
				
		}
		else
		{
		double availableBalance=super.getLoanAmount();
		availableBalance-=Amount;
		super.setLoanAmount(availableBalance);
		System.out.println(" Total Pending Loan "+super.getLoanAmount());
	
		}
	}

	public void topUpLoan(double Amount)
	{
		if((super.getLoanAmount()+Amount)>1000000)
		{
			System.out.println(" Your Loan Limit is excessed. ");
				
		}
		else
		{
		double availableBalance=super.getLoanAmount();
		availableBalance+=Amount;
		super.setLoanAmount(availableBalance);
		System.out.println(" Total Loan "+super.getLoanAmount());
	
		}
	}
	
	public void repayment(double Amount)
	{
		payEMI(Amount);		
	}
	

}