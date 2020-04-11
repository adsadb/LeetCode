package code;

import java.util.Arrays;

public class title_887_superEggDrop {
    public int superEggDrop(int K, int N) {
        int dp[][] = new int[N+1][K+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], i);
        }
        for(int i = 0;i <= K;i++){
            dp[0][i] = 0;
        }
        for(int i = 0;i <= N;i++){
            dp[i][1] = i;
        }
        for(int i = 2;i<= N;i++){
            for(int j = 2;j <= K;j++) {
                int left = 0,right = i;
                while(left < right){
                    int mid = left + (right - left + 1)/2;
                    int breakCount = dp[mid - 1][j -1];
                    int notBreakCount = dp[i - mid][j];
                    if(breakCount > notBreakCount){
                        right = mid - 1;
                    }
                    else{
                        left = mid;
                    }
                }
                dp[i][j] = Math.max(dp[left-1][j-1],dp[i-left][j])+1;
                /*
                顺序遍历找最大值，速度超时，应该换为二分或其他搜索法
                for(int k = 1;k <= i;k++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k-1][j - 1], dp[i - k][j])+1);
                }*/
            }
        }
        return dp[N][K];
    }
}
