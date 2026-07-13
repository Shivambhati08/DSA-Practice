
import java.util.Collections;
import java.util.PriorityQueue;

public class reversePriorityQueue {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6,7,8,1};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(pq.remove()+" ");
        }
    }
}
