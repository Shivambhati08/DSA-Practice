public class kadansmax {
    public static void main(String[] args) {
           int[] arr = {1,-2,6,-1,3};

        int maxsum = Integer.MIN_VALUE;
        int currsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currsum = Math.max(arr[i], currsum+arr[i]);
            maxsum = Math.max(maxsum, currsum);
           
        }
        System.out.println("Maximum sum : "+maxsum);
    }
}
