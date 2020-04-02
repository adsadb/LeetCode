package code;

public class title_912_sortArray {
    //快排
    public int[] sortArray(int[] nums) {
        sortArray(nums,0,nums.length-1);
        return nums;
    }
    public void sortArray(int[] nums, int left, int right){
        int low = left,high = right;
        if(low > high)return ;
        int privot = nums[low];
        while(low < high){
            while(low < high && nums[high] >= privot)high--;
            swap(nums,low,high);
            while(low < high && nums[low] <= privot)low++;
            swap(nums,low,high);
        }
        sortArray(nums,left,low-1);
        sortArray(nums,low+1,right);
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        title_912_sortArray test = new title_912_sortArray();
        int [] a = test.sortArray(new int[] {5,4,7,9,1,2,8,4,10,2,3,4,6});
        for (int b:a) {
            System.out.print(b);
        }

    }
}
