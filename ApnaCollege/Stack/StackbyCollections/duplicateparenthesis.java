import java.util.Stack;

public class duplicateparenthesis {
    public static boolean dupparenth(String str){
         Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(stack.peek() != '('){
                    count++;
                    stack.pop();
                }
                if(count < 1){
                    return true;
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(ch); 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(dupparenth(str));
    }
}
