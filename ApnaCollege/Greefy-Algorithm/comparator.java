import java.util.*;
public class comparator {
    public static void main(String[] args) {
        int[][] arr = {{-4, 10}, {-5, 2}, {-3,10}, {2, 4}, {1, 3}, {10,2}};

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
