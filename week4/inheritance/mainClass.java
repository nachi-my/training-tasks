package week4.inheritance;
import java.util.Date;
public class mainClass {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount objSavingsAccount=new SavingsAccount(1234567890, "Geeta", "Indore", 458201, new Date(), 10000);
		System.out.println(objSavingsAccount);
		objSavingsAccount.closeAccount();
		System.out.println(objSavingsAccount);
		objSavingsAccount.withdraw(1000);
//		objSavingsAccount.withdraw(10000);
		objSavingsAccount.deposit(10000);
		objSavingsAccount.setFdBalance(10000);
		System.out.println("F.D. Balance = "+objSavingsAccount.getFdBalance());
		objSavingsAccount.fixedDeposit();
		
		LoanAccount objLoanAccount=new LoanAccount(1234567890, "Geeta", "Indore", 458201, new Date(), 10000);
		System.out.println(objLoanAccount);
		objLoanAccount.setLoanAmount(100000);
		System.out.println("Loan Amount = "+objLoanAccount.getLoanAmount());
		objLoanAccount.payEMI(1000);
//		objLoanAccount.payEMI(100000);
		objLoanAccount.topUpLoan(1000);
		objLoanAccount.topUpLoan(1000000);
		System.out.println("Loan Amount = "+objLoanAccount.getLoanAmount());
		objLoanAccount.repayment(1000);
		objLoanAccount.payEMI(99000);
	}
}
