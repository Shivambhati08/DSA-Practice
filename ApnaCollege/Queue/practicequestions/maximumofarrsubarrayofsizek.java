
import java.util.*;

public class maximumofarrsubarrayofsizek {

    public static void windowmax(int[] arr, int n, int k) {
        Deque<Integer> deque = new LinkedList<>();
        // 1 window
        for (int i = 0; i < k; i++) {
            while (deque.size() > 0 && arr[deque.getLast()] <= arr[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for (int i = k; i < arr.length; i++) {

            // Print max
            System.out.print(arr[deque.getFirst()] + " ");

            // Remove which are not part of current window
            while (deque.size() > 0 && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove the smaller value
            while (deque.size() > 0 && arr[deque.getLast()] <= arr[i]) {
                deque.removeLast();
            }
             deque.addLast(i);
        }
        System.out.print(arr[deque.getFirst()]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        windowmax(arr, arr.length, k);
    }
}
