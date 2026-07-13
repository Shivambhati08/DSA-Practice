
import java.util.*;

public class queueusingdeque {

    static class Queue {

        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int data) {
            deque.addLast(data);
        }

        public int dequeue() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print(q.dequeue()+" ");
        System.out.print(q.dequeue()+" ");
        System.out.print(q.dequeue()+" ");

    }
}
