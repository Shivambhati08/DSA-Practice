public class kokoeatingbananas {
    public static int max(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int findrequiretime(int[] arr, int minhour){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
                total += (int)Math.ceil((double)arr[i]/minhour);
                System.out.println(total);
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 11};
        int h = 8;

        int max = max(arr);
        int reqtime = 0;
        int low = 1, high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            reqtime = findrequiretime(arr, mid);
            if(reqtime <= h){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(low);
        System.out.println(high);
    }
}
