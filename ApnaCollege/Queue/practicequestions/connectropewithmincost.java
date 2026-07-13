import java.util.*;
public class connectropewithmincost {
    public static int minrope(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        int rope = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            rope += first + second;
            pq.add(first+second);
        }
        return rope;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3,2,6};

        System.out.println(minrope(arr));
    }
}
