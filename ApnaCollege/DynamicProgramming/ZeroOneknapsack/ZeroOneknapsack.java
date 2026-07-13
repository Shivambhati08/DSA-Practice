public class ZeroOneknapsack {
    // Recursion
    public static int knapsack(int[] val, int[] weight, int W, int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(weight[n  - 1] <= W){
            int ans1 = val[n - 1] + knapsack(val, weight,W - weight[n - 1], n-1);

            int ans2 = knapsack(val, weight, W, n - 1);
            return Math.max(ans1, ans2);
        }
        else{
            return knapsack(val, weight, W, n-1);
        }
    }

    // Memoization O(n * W)
    public static int knapsackmemoization(int[] val, int[] weight, int W, int n, int[][] dp){
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(weight[n-1] <= W){
            int ans1 = val[n-1] + knapsackmemoization(val, weight, W- weight[n-1], n-1, dp);
            int ans2 = knapsackmemoization(val, weight, W, n-1, dp);
            return dp[n][W] = Math.max(ans1, ans2);
        }
        else{
            return dp[n][W]= knapsackmemoization(val, weight, W, n-1, dp);
        }
    }

    // Tabulation O(n * W)
    public static int knapsacktabulation(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <n+1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <W+1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if(w <= j){
                    int incprofit = v + dp[i-1][j-w];
                    int exprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit, exprofit);
                }
                else{
                    int exprofit = dp[i-1][j];
                    dp[i][j] = exprofit;
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] weight = {2, 5, 1, 3, 4};
        int W = 7;
        // memoization
        // int[][] dp = new int[val.length+1][W + 1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(knapsackmemoization(val, weight, W, val.length, dp));

        System.out.println(knapsacktabulation(val, weight, W));
    }
}
