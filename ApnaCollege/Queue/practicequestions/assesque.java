
import java.util.*;

public class assesque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int ele : q) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            if (!q.isEmpty()) {
                System.out.print(q.remove() + " ");
            } else {
                System.out.println();
                System.out.print("Queue is empty!");
                return;
            }

        }
        System.out.println();
        if(q.isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        for (int ele : q) {
            System.out.print(ele+" ");
        }
    }
}
