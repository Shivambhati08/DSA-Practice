public class trappedwater {
    public static int trappingwater(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];

        int maxleft = arr[0];
        int maxright = arr[n-1];
        for (int i = 1; i < n; i++) {
            if(maxleft < arr[i]){
                maxleft = arr[i];
            }
            left[i] = maxleft;
        }
        for (int i = n-2; i >= 0; i--) {
            if(maxright < arr[i]){
                maxright = arr[i];
            }
            right[i] = maxright;
        }
        int maxwater = 0;
        for (int i = 0; i < 10; i++) {
            int water = Math.min(left[i],  right[i]);
            maxwater += water - arr[i];
        }
        return maxwater;
        
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trapwater = trappingwater(height);
        System.out.println(trapwater);
    }
}
