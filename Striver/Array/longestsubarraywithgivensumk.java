import java.util.HashMap;

public class longestsubarraywithgivensumk {
    public static int longestsubarraywithksum(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                max = Math.max(max, i+1);
            }
            if(map.containsKey(sum - k)){
                max = Math.max(max, i - map.get(sum - k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int[] brr = {-5, 8, -14, 2, 4, 12};

        System.out.println(longestsubarraywithksum(arr, 15));
        System.out.println(longestsubarraywithksum(brr, -5));

    }
}
