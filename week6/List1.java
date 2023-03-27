package week6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class List1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Original List: " + numbers);

        Set<Integer> uniqueNumbers = new HashSet<Integer>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("List with unique elements: " + numbers);

        scanner.close();
    }
}

