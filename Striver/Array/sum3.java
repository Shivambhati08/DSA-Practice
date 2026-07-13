
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class sum3 {

    // 1. Brute force approach TC O(n^3)
    public static void sum3bruteforce(int[] arr){
        HashSet<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> newlist = new ArrayList<>();
                        newlist.add(arr[i]);
                        newlist.add(arr[j]);
                        newlist.add(arr[k]);
                        Collections.sort(newlist);
                        set.add(newlist);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        System.out.println(list);
    }

    // 2. Better approach O(n^2)
    public static void sum3better(int[] arr){
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if(hs.contains(third)){
                    List<Integer> newlist = new ArrayList<>();
                    newlist.addAll(Arrays.asList(arr[i], arr[j], third));
                    Collections.sort(newlist);
                    set.add(newlist);
                }
                hs.add(arr[j]);
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        System.out.println(list);
    }
    // 3. Two Pointer optimal O(n^2) 
    public static void sum3twopointer(int[] arr){
        List<List<Integer>> list =  new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i + 1;
            int k = n-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> newlist = new ArrayList<>();
                    newlist.addAll(Arrays.asList(arr[i], arr[j], arr[k]));
                    list.add(newlist);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j+1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        // sum3bruteforce(arr);
        // sum3better(arr);
        sum3twopointer(arr);
    }
}
