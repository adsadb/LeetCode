package code;

import java.util.List;
/*
    自底向上
    dp[i]代表计算第i-1行的最小值时，第i行的最小值
    dp[]长度取triangle.size()+1可以将初始化操作合并到dp[]循环当中
    动态方程：dp[j] = Math.min(dp[j],dp[j+1]) + row.get(j);
 */
public class title_120_minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0 || triangle == null)return 0;
        int dp[] = new int[triangle.size()+1];
        for(int i = triangle.size()-1;i >= 0;i--){
            List<Integer> row = triangle.get(i);
            for(int j = 0;j < row.size();j++){
                dp[j] = Math.min(dp[j],dp[j+1]) + row.get(j);
            }
        }
        return dp[0];
    }
}
