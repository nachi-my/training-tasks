package week3;
import java.util.Scanner;

public class HighestNumber_4 {

   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the first number:");
       int num1 = scanner.nextInt();
       
       System.out.println("Enter the second number:");
       int num2 = scanner.nextInt();
       
       System.out.println("Enter the third number:");
       int num3 = scanner.nextInt();
       
       int highestNum = num1;
       
       if (num2 > highestNum) {
           highestNum = num2;
       }
       
       if (num3 > highestNum) {
           highestNum = num3;
       }
       
       System.out.println("The highest number is: " + highestNum);
       
       scanner.close();
   }

}
