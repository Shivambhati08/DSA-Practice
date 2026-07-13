import java.util.LinkedList;
import java.util.Queue;

public class interleavetwohalvesofQueue {
    public static void interleave(Queue<Integer> queue){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = queue.size();

        for(int i = 0; i< size/2; i++){
            firsthalf.add(queue.remove());
        }
        for(int i = 0; i < size/2; i++){
           queue.add(firsthalf.remove());
           queue.add(queue.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        interleave(queue);
        System.out.println(queue);
    }
  
}


