import java.util.Arrays;

public class aggresivecows {
     public static int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int low = 1, high = max-min;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr, mid, k)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean possible(int[] arr, int mid, int k){
        int cnt = 1;
        int put = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]- put >= mid){
                put = arr[i];
                cnt++;
                if(cnt == k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9}; // Distance between stalls
        int k = 3; // Number of cows 
        int res = aggressiveCows(arr, k); // minimum distance between any two cows is maximized.
        System.out.println(res);
    }
}
