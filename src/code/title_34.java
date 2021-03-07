package code;

public class title_34 {
    public int[] searchRange(int[] nums, int target) {
        int index = searchNum(nums,target);
        if(index == -1)return new int[] {-1,-1};
        else return helper(nums,index);
    }
    public int searchNum(int[] nums,int target){
        int len = nums.length;
        int mid;
        int low = 0,high = len-1;
        while(low < high){
            mid = (low + high) / 2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)low = mid + 1;
            else if(nums[mid] > target)high = mid - 1;
        }
        return -1;
    }
    public int[] helper(int[] nums,int index){
        int temp = nums[index];
        int low = index,high = index;
        while(low-1 >= 0 && nums[low-1] == nums[index]) {
            low--;
        }
        while(high+1 < nums.length && nums[high+1] == nums[index]) {
            high++;
        }
        return new int[] {low,high};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,3};
        int target = 1;
        title_34 title_34 = new title_34();
        title_34.searchRange(nums,target);
    }
}
