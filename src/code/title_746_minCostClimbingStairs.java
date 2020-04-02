package code;

public class title_746_minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len <= 0)return 0;
        if(len < 3)return cost[len-1];
        int dp[] = new int[] {cost[0],cost[1]};
        for(int i = 2;i < len;i++){
            int max = Math.min(dp[0],dp[1]) + cost[i];
            dp[0] = dp[1];
            dp[1] = max;
        }
        return dp[1];
    }
}
