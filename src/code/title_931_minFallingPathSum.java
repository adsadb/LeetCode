package code;
/*
    可视性太差了。。。
    dp加了一行和左右两列
    一行：第一行，作为初始化dp第0行的默认数组
    两列：第一行和最后一行，为了让所有的操作都不需要判断边界
 */
public class title_931_minFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        int dp[][] = new int[len+1][len+2];
        dp[0][0] = dp[0][len+1] = Integer.MAX_VALUE;
        for(int i = 1;i < len+1;i++){
            dp[i][0] = dp[i][len+1] = Integer.MAX_VALUE;
            for(int j = 0;j < len;j++){
                dp[i][j+1] = Math.min(dp[i-1][j],Math.min(dp[i-1][j+1],dp[i-1][j+2])) + A[i-1][j];
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int a :dp[len]) {
            ans = Math.min(a,ans);
        }
        return ans;
    }
}
