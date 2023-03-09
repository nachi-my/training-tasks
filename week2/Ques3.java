package week2;
import java.util.*;
public class Ques3{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		double num1=0,num2=0,result;
		System.out.print("Enter Two No.");
		
		try
		{
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			result=num1+num2;
			System.out.print("Result = "+ result);
			
		}
		catch (Exception err)
		{
			System.out.print("Error = "+err);
		}
		
		sc.close();
		
	}

}