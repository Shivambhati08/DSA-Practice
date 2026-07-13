import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
                if(set.contains(arr2[i])){
                    count++;
                    list.add(arr2[i]);
                    set.remove(arr2[i]);
                }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
