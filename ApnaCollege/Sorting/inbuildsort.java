import java.util.*;
public class inbuildsort {
    public static void main(String[] args) {
        Integer[] arr = {-1, 0, 8, 3, 1};
        // Arrays.sort(arr);

        // Arrays.sort(arr, 2, 5);
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // for (int i = 0; i < arr.length; i++) {
        //      System.out.print(arr[i] + " ");
        // }
    }
}
