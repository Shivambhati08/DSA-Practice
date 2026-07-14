public class makeMbuquets{
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        int m = 3;
        int k = 2;

        int low = 1, high = max(arr);
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr, mid, m, k)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
    public static boolean possible(int[] arr, int day, int m, int k){
        int cnt = 0;
        int noOfBuq = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= day){
                cnt++;
            }
            else{
                noOfBuq += cnt/k;
                cnt = 0;
            }
        }
        noOfBuq += cnt/k;
        return noOfBuq >= m;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,  arr[i]);
        }
        return max;
    }
}