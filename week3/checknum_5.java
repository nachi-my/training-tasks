package week3;
import java.util.Scanner;

public class checknum_5{
	public static void main(String[] args) {
		String pincode;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pincode:- ");
		pincode = sc.nextLine();

		String regExPattern = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

		if (pincode.matches(regExPattern))
			System.out.println("Pincode is Valid");
		else
			System.out.println("Pincode is Invalid");
		sc.close();

	}
}

