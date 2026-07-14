public class findthesmallestdivisor {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int threshold = 5;  // sum of dividents should be less then or equal to threshold
        int low = 1, high = max(arr);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr, mid, threshold)){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(low);
    }
    public static boolean possible(int[] arr, int mid, int threshold){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil((double)arr[i]/mid);
        }
        return total <= threshold;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
