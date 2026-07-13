import java.util.Stack;

public class reversestring {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < str.length()){
            stack.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Shummi and yami";
        System.out.println(reverse(str));
    }
}
