package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends RuntimeException
{
	MyException(String message)
	{
		super(message);
	}
}

public class BuildCustomExceptions {
    public static void main(String[] args) {
		int num1,num2,ans=0;
		Scanner sc=new Scanner(System.in); 
		try {
			System.out.println("Enter the Num1 - ");
			num1=sc.nextInt();
			System.out.println("Enter the Num2 - ");
			num2=sc.nextInt();
			if(num2==1) throw new MyException("Can't divide divisor is greater than dividend"); 
			ans=num1/num2;
			System.out.println("Answer = "+ans);
		}
		catch (MyException e ) {
			System.out.println("User Defined Exception "+e);
		}
		catch (InputMismatchException e ) {
			System.out.println("Entered wrong parameter");
		}
		catch (ArithmeticException e ) {
			System.out.println("Arithmetic Exception num2 can't be zero");
		}catch (Exception e ) {
			System.out.println(e);
		}finally {
			System.out.println("This is end of program");
		}
	}
}
