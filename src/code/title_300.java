package code;

public class title_300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0)return 0;
        int max = Integer.MIN_VALUE;
        int dp[] = new int[len];
        dp[0] = 1;
        for(int i = 1;i < len;i++){
            dp[i] = 1;
            for(int j = i-1;j >= 0;j--){
                if(nums[j] < nums[i])dp[i] = dp[i]>dp[j]?dp[i]:dp[j]+1;
            }
        }
        for (int a:dp) {
            max = Math.max(max,a);
        }
        return max;
    }
}
