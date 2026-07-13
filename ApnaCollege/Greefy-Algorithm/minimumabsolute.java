import java.util.*;
public class minimumabsolute{
    public static void main(String[] args) {
        int[] arr = {4,1,8,7};
        int[] brr = {2,3,6,5};

        Arrays.sort(arr);
        Arrays.sort(brr);

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min += Math.abs(arr[i]- brr[i]);
        }
        System.out.println(min);
    }
}