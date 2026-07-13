import java.util.ArrayList;
import java.util.List;
public class permutation {
    public static void permutation(int[] arr, int idx, List<List<Integer>> list){
        if(idx == arr.length){
            List<Integer> newlist = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                newlist.add(arr[i]);
            }
            list.add(newlist);
            return;
        }
        for(int i = idx; i< arr.length; i++){
            swap(arr, i, idx);
            permutation(arr, idx + 1, list);
            swap(arr, i, idx);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = new ArrayList<>();
        permutation(arr, 0, list);
        for (List<Integer> list2 : list) {
            for (Integer i : list2) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
