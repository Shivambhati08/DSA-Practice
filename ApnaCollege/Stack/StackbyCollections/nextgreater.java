import java.util.Stack;

public class nextgreater {
    public static void nextgreater(int[] arr, int[] next){
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i>= 0; i--){
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = -1;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] next = new int[arr.length];
        nextgreater(arr, next);
        for (int i : next) {
            System.out.print(i+" ");
        }
    }
}
