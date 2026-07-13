import java.util.*;
public class simplifypath{
    public static String simplify(String str, int i, String ans){
        Stack<Character> stack = new Stack<>();
        if(i == str.length()){
            return ans;
        }
        char ch = str.charAt(i);
        if(ch == '/' || ch >= 'a' && ch <= 'z'){
            stack.push(ch);
        }
        else if(ch == '..'){
            stack.pop();
        }
        else{
            
        }
    }
    public static void main(String[] args){
        String str = "/a/./b/../../c/";
        str = simplify(str, 0, "");
    }
}