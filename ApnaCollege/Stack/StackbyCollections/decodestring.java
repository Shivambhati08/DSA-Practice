import java.util.Stack;

public class decodestring {
    public static String decode(String str){
        Stack<Integer> countstack = new Stack<>();
        Stack<Character> strstack = new Stack<>();
        
        int num = 0;
        String curr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                
            }
            else if(ch == '['){
                countstack.push(ch-'0');
            }
            else{
                stack.push(ch);
            }
        }
        while()
        return ans;
    }
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String result = decode(str);

        System.out.println(result);
        
    }
}
