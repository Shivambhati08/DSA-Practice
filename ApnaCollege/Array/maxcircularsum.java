
public class maxcircularsum {

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int total = 0;
        int currmin = 0;
        int minsum = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            currsum += nums[i];
            maxsum = Math.max(maxsum, currsum);
            if (currsum < 0) {
                currsum = 0;
            }
            currmin += nums[i];
            minsum = Math.min(minsum, currmin);
            if (currmin > 0) {
                currmin = 0;
            }
        }
        if (total == minsum) {
            result = maxsum;
        }
        result = Math.max(maxsum, total - minsum);
        System.out.println(result);
    }
}
