import java.util.*;
public class practice {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        // System.out.println(queue.add(10));
        // System.out.println(queue.get(0));

        list.add(10);
        list.add(20);
        // System.out.print(list);
        // System.out.print(list.get(0));
        System.out.println(list);
        list.add(0, 50);
        //  System.out.print(list.get(0));
        list.remove(1);
        System.out.println(list);
    }
}
