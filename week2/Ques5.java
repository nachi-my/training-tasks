package week2;
import java.util.Scanner;

public class Ques5 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		double num1,num2,res;
		try
		{
			System.out.print("Enter Numerator :- ");
			num1=sc.nextDouble();
			System.out.print("Enter Denomenator :- ");
			num2=sc.nextDouble();
			res=num1/num2;
			System.out.println("Result = "+res);
		}
		catch (Exception err) 
		{
			System.out.println("Error = "+err);
		}
		sc.close();
	}

}