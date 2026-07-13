
import java.util.*;

public class activitySelection{
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        ArrayList<Integer> list = new ArrayList<>();
        int[][] arr = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        
        int count = 1;
        list.add(arr[0][0]);
        int lastend = arr[0][2];
        for(int i = 1; i < end.length; i++) {
            if(lastend <= arr[i][1]){
                lastend = arr[i][2];
                list.add(arr[i][0]);
                count++;
            }
        }
        System.out.println(count);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}