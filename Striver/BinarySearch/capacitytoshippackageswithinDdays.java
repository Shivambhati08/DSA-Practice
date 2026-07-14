public class capacitytoshippackageswithinDdays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int totalsum = 0;
        for (int i : arr) {
            totalsum += i;
        }
        int low = max(arr), high = totalsum;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr, mid, days)){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
    public static boolean possible(int[] arr, int mid, int days){
        int sum = 0;
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            if(sum + arr[i] > mid){
                day++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            } 
        }
        System.out.println(day);
        return day <= days;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
