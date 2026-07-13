public class maximumproductsubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        int n = arr.length;
        int pre = 1, suf = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pre *= arr[i];
            suf *= arr[n-i-1];
            max = Math.max(max, Math.max(pre, suf));
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
        }
        
        System.out.println(max);
    }
}
