
import java.util.Stack;


public class reversestack {
    public static void pushatbottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        pushatbottom(stack, value);
        stack.push(top);
    }
    public static void revstack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        revstack(stack);
        pushatbottom(stack, top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        revstack(stack);
        System.out.println("-------------------------------------");
        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }



        
    }
}
