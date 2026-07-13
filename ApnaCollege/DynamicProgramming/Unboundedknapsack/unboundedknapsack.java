public class unboundedknapsack {
    public static int unboundknapsack(int[] val, int[] weight, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = weight[i-1];
                if(w <= j){
                    int incprofit = v + dp[i][j-w];
                    int exprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit, exprofit);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
         int[] val = {15, 14, 10, 45, 30};
        int[] weight = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(unboundknapsack(val, weight, W));
    }
}
