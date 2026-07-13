
import java.util.*;

public class maximumlengthchainofpairs {
    public static void main(String[] args) {
        int[][] arr = {{5,24}, {39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

        int count = 1;
        int lastend = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if(lastend < arr[i][0]){
                count++;
                lastend = arr[i][1];
            }
        }
        System.out.println(count);
    }
}
