
import java.util.ArrayList;
import java.util.Stack;


public class stockspanproblem {
    public static void stockspan(int[] arr, ArrayList<Integer> list){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        list.add(1);

        int i = 1;
        while(i < arr.length){
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                    stack.pop();
            }
            if(stack.isEmpty()){
                list.add(i+1);
            }
            else{
                list.add(i - stack.peek());
            }
            stack.push(i);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 85, 100};
        ArrayList<Integer> list = new ArrayList<>();
        stockspan(arr, list);
        System.out.println(list);
    }
}
