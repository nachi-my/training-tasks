package week3;
public class SecondHighest_2 {
    public static void main(String[] args) {
       int[] arr = { 10, 20, 30, 40, 50 };
       int highest = arr[0];
       int secondHighest = arr[0];
       
       for (int i = 1; i < arr.length; i++) {
          if (arr[i] > highest) {
             secondHighest = highest;
             highest = arr[i];
          } else if (arr[i] > secondHighest && arr[i] != highest) {
             secondHighest = arr[i];
          }
       }
       
       System.out.println("The second highest number in the array is: " + secondHighest);
    }
 }

 
 
 
 