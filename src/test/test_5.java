package test;

public class test_5 {
    public int jump(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        int len = nums.length;
        int num = 0;
        return helper(nums,0,num);
    }
    private int helper(int[] nums, int index, int num){
        if(index >= nums.length)return num;
        for(int i = 1;i < nums[index];i++){
            num = Math.min(num,helper(nums,index + i,num+1));
        }
        return num == 0 ? Integer.MAX_VALUE : num;
    }

    public static void main(String[] args) {
        test_5 test = new test_5();
        int[] data = {2,3,1,1,4};
        System.out.println(test.jump(data));
    }
}
