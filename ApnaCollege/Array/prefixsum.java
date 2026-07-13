public class prefixsum {
    public static void main(String[] args) {
         int[] arr = {1,-2,6,-1,3};

        int maxsum = arr[0];

        int[] prefix = new int[arr.length+1];
        prefix[0] = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix[i+1] = prefix[i]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int currsum = 0;
            for (int j = i; j < arr.length; j++) {
                
                currsum = prefix[j+1]-prefix[i];
                maxsum = Math.max(maxsum, currsum);
            }
        }

    
        System.out.println("Maximum sum : "+maxsum);
    }
}
