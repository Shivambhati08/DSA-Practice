
import java.util.Arrays;

public class buyandsellstocksunlimited {
    public static int buysell(int[] prices, int[][] dp, int idx, int buy){
        if(idx == prices.length){
            return 0;
        }
        if(dp[idx][buy] != -1){
            return dp[idx][buy];
        }
        int profit = 0;
        if(buy != 0){
            int buyst = -prices[idx] + buysell(prices, dp, idx + 1, 0);
            int skipst = buysell(prices, dp, idx+1, 1);
            profit = Math.max(buyst, skipst);
        }
        else{
            int sellst = prices[idx] + buysell(prices, dp, idx + 1, 1);
            int skipst = buysell(prices, dp, idx + 1, 0);
            profit = Math.max(sellst, skipst);
        }
        return dp[idx][buy] = profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; 
        
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(buysell(prices, dp, 0, 1));
        
    }
}
