public class traipingrainwater {
    public static void main(String[] args) {
        int[] arr = {3,0,1,0,4,0,2};
        
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n-1] = arr[n-1];
        int leftmax = arr[0];
        int rightmax = arr[n-1];
        for (int i = 1; i < n; i++) {
            if(leftmax < arr[i]){
                leftmax = arr[i];
            }
            left[i] = leftmax;
        }
        for (int i = n-2; i >= 0 ; i--) {
            if(rightmax < arr[i]){
                rightmax = arr[i];
            }
            right[i] = rightmax;
        }
        int maxwater = 0;
        for (int i = 0; i < n; i++) {
            int height = Math.min(left[i], right[i]);
            maxwater += (height - arr[i]);
        }
        System.out.println(maxwater);
    }
}
