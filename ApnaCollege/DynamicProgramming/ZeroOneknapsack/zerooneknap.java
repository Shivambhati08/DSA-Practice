public class zerooneknap{
    // Tabulation
    public static int knapsack(int[] val, int[] weight, int W){
        int n = val.length;
        int[][] dp = new int[n + 1][W+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int wt = weight[i-1];
                if(wt <= j){
                    int incprofit = v + dp[i-1][j - wt];
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
    public static void main(String[] args){
        int[] val = {15, 14, 10, 45, 30};
        int[] weight = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val, weight, W));
    }
}