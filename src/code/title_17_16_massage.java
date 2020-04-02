package code;

import java.util.Map;

public class title_17_16_massage {
    public int massage(int[] nums) {
        int len = nums.length;
        if(len == 0)return 0;
        if(len == 1)return nums[0];
        int dp[] = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i < len;i++){
            dp[i] = (dp[i-2]+nums[i]>dp[i-1])?dp[i-2]+nums[i]:dp[i-1];
        }
        return Math.max(dp[len-1],dp[len-2]);
    }

    public static void main(String [] args){
        title_17_16_massage test = new title_17_16_massage();
        int data[] = {1,2,3,1,4,5,6};
        test.massage(data);
    }
}
