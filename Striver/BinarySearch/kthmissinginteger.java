public class kthmissinginteger {

    // Brute force O(n)
    public static void findkthmissing(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) k++;
            else break;
        }
        System.out.println(k);
    }

    // Optimal 
    public static void findmissingkthnum(int[] arr, int k){
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(high + k + 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        // findkthmissing(arr, k);
        findmissingkthnum(arr, k);

    }
}
