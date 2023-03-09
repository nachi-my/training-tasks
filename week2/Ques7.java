package week2;

import java.util.Scanner;

public class Ques7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double num1,num2,sum,division,product,remainder,subtraction;
		try
		{
			System.out.print("Enter Number 1 :- ");
			num1=sc.nextDouble();
			System.out.print("Enter Number 2 :- ");
			num2=sc.nextDouble();
			
			sum=num1+num2;
			System.out.println("Addition = "+sum);
			
			product=num1*num2;
			System.out.println("Multiplication = "+product);
			
			subtraction=num1-num2;			
			System.out.println("Subtraction = "+subtraction);
			
			division=num1/num2;			
			System.out.println("Division = "+division);
			
			remainder=num1%num2;			
			System.out.println("Remainder = "+remainder);
			
		}
		catch (Exception err) 
		{
			System.out.println("Error = "+err);
		}
		sc.close();
	}
}
