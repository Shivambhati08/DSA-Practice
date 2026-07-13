import java.util.*;
public class hashsetOP {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,2,4,2,3,1,2,4};
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.contains(4));
        System.out.println(set.contains(5));
    }
    
}
