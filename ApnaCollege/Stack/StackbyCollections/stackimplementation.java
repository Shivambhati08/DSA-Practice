
import java.util.Stack;


public class stackimplementation {

    public static void pushatbottom(Stack<Integer> s1, int value){
        if(s1.isEmpty()){
            s1.push(value);
            return;
        }
        int top = s1.pop();
        pushatbottom(s1, value);
        s1.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack.isEmpty();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        pushatbottom(stack, 5);

        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
