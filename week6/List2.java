package week6;

import java.util.*;

public class List2 {
    public static void main(String a[]) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option, element = 0;
        while (true) {
            {

                System.out.println("Enter your option: ");

                System.out.println("1.Add 2.Remove 3.Display Element 4.Exit");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter element to Add : ");
                        element = sc.nextInt();
                        list.add(element);
                        break;

                    case 2:
                        System.out.println("Enter element to Remove : ");
                        element = sc.nextInt();
                        if (!(list.contains(element)))
                            System.out.println("Element is not present.");
                        else {
                            list.remove(Integer.valueOf(element));
                            System.out.println("Element removed successfully");
                        }
                        break;
                    case 3:
                        System.out.println("List of elements : ");
                        System.out.println(list);
                        break;
                    case 4:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
