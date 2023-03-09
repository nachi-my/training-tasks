package week2;

import java.util.Scanner;

public class Ques8 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double num1,num2,num3,average;
		try
		{
			System.out.print("Enter Number 1 :- ");
			num1=sc.nextDouble();
			System.out.print("Enter Number 2 :- ");
			num2=sc.nextDouble();
			System.out.print("Enter Number 3 :- ");
			num3=sc.nextDouble();
			
			average=(num1+num2+num3)/3.0;
			System.out.println("Average = "+average);
			
		}
		catch (Exception err) 
		{
			System.out.println("Error = "+err);
		}
		sc.close();
	}

}
