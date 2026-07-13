import java.util.*;

public class nonrepeatingstream {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();

        String str = "aabccxb";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch-'a']++;
            
            while(!queue.isEmpty() && freq[queue.peek()-'a'] > 1){
                queue.remove();
            }
            if(queue.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(queue.peek()+" ");
            }
        }
    }
}
