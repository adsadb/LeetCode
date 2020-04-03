package code;

public class title_53_maxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null)return 0;
        int ans = nums[0];
        for(int i = 1;i < nums.length;i++){
            nums[i] += Math.max(nums[i-1],0);
            ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
}
