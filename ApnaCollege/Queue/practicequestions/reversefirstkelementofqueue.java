
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reversefirstkelementofqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for (int i = 0; i < n-k; i++) {
            queue.add(queue.remove());
        }
        while(!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
