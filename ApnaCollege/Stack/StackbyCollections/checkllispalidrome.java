import java.util.*;
public class checkllispalidrome {

    public static boolean palindrome(LinkedList<Character> ll){
        Stack<Character> stack = new Stack<>();
        for (char ch : ll) {
            stack.push(ch);
        }
        for(char ch : ll){
            if(ch != stack.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('A');

        System.out.println(palindrome(ll));
        
    }
}
