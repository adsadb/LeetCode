package code;

public class title_416_canPartition {
    //回溯算法
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0)return false;
        sum /= 2;
        return helper(nums, 0,sum);
    }
    private boolean helper(int[] nums, int index, int target){
        if(target == 0)return true;
        if(index == nums.length || target < 0)return false;
        if(helper(nums,index+1,target-nums[index]))return true;
        int j = index + 1;
        while(j < nums.length && nums[index] == nums[j]){
            j++;
        }
        return helper(nums, j, target);
    }

    //动态规划
    public boolean canPartition1(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0)return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for(int num : nums){
            for(int j = sum;j >= 0;j--){
                if(j >= num){
                    dp[j] = dp[j] || dp[j-num];
                }
            }
        }

        return dp[sum];
    }
}
