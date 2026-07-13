
import java.util.Stack;

public class validparenthesis {

    public static boolean validparenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && stack.peek() == '(') 
                    || (ch == '}' && stack.peek() == '{')
                    ||  (ch == ']' && stack.peek() == '[') ){
                    stack.pop();
                } 
                else{
                    return false;
                }
            }

            i++;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(validparenthesis(str));

    }
}
