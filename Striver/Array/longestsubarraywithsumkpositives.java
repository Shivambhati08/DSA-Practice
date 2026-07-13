public class longestsubarraywithsumkpositives {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 1, 1,1, 1, 3, 3};
        int k = 6;
        int max = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while(sum > k){
                sum -= arr[i];
                i++;
            }

            if(sum == k){
                max = Math.max(max, j-i+1);
            }
        }
        System.out.println(max);
    }
}
