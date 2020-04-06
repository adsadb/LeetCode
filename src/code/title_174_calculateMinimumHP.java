package code;
/*
    从lenx和leny开始计算，逆向思维
    int temp = Math.min(dp[i+1][j],dp[i][j+1]) - dungeon[i][j];
    dp[i][j] = temp>1?temp:1;
    代表到[i][j]这个位置我最少需要的生命值，如果这个值小于1，就代表溢出了这么多的生命值，需要舍弃掉
    申请[lenx+1][leny+1]，
    将[i][leny]和[lenx][i]设置为Integer.MAX_VALUE，
    将[lenx][leny-1]，[lenx-1][leny]设置为1（能到达最终点的最小生命值>0）
    是为了使操作一致
 */
public class title_174_calculateMinimumHP {
    public int calculateMinimumHP(int[][] dungeon) {
        int lenx = dungeon.length,leny = dungeon[0].length;
        int dp[][] = new int[lenx+1][leny+1];
        for(int i = 0;i < lenx;i++){
            dp[i][leny] = Integer.MAX_VALUE;
        }
        for(int i = 0;i < leny;i++){
            dp[lenx][i] = Integer.MAX_VALUE;
        }
        dp[lenx][leny-1] = dp[lenx-1][leny] = 1;
        for(int i = lenx - 1;i >= 0;i--){
            for(int j = leny - 1;j >= 0;j--){
                int temp = Math.min(dp[i+1][j],dp[i][j+1]) - dungeon[i][j];
                dp[i][j] = temp>1?temp:1;
            }
        }
        return dp[0][0];
    }
}
