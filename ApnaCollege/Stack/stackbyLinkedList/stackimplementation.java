
import java.util.LinkedList;

public class stackimplementation {
    static class stackA{
        static LinkedList<Integer> stack = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty(){
            return stack.size() == 0;
        }
        // Push
        public static void push(int data){
            stack.add(data);
        }

        // Pop
        public static int pop(){
            if(stack.isEmpty()){
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        // Peek
        public static int peek(){
             if(stack.isEmpty()){
                return -1;
            }
            return stack.get(stack.size()-1);
        }

    }
    public static void main(String[] args) {

        stackA.push(10);
        stackA.push(20);

        while(!stackA.isEmpty()){
            System.out.println(stackA.peek());
            stackA.pop();
        }s
    }
}
