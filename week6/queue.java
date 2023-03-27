package week6;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the queue: ");
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }

        System.out.print("Enter the number of elements to reverse: ");
        int k = sc.nextInt();

        reverseFirstK(queue, k);

        System.out.println("The reversed queue is:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k <= 0 || k > queue.size()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.offer(queue.poll());
        }
    }
}
