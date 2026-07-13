



public class climbingStairs {
    // Recursion O(2^n)
    public static int climbingstairs(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return climbingstairs(n - 1) + climbingstairs(n - 2);
    }

    // Memoization O(n)
    public static int climbstairsmemoization(int n, int[] steps){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(steps[n] != -1){
            return steps[n];
        }
        return steps[n] = climbstairsmemoization(n-1, steps) + climbstairsmemoization(n - 2, steps);
    }

    // Tabulation O(n)
    public static int climbstairtabulation(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(climbingstairs(n));
        // int[] steps = new int[n+1];
        // Arrays.fill(steps, -1);
        // System.out.println(climbstairsmemoization(n, steps));
        System.out.println(climbstairtabulation(n));
    }
}
