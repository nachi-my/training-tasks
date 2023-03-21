package week5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DiffExceptions {
    public static void main(String[] args) {
		int num1,num2,ans=0;
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.println("Enter first Num- ");
			num1=sc.nextInt();
			System.out.println("Enter Second Num- ");
			num2=sc.nextInt();
			ans=num1/num2;
			System.out.println("Answer = "+ans);
		}
		catch (InputMismatchException e ) {
			System.out.println("User entered wrong parameter");
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
