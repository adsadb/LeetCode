package code;

public class title_169 {
    public int majorityElement(int[] nums) {
        int max[] = {nums[0],0};
        for (int num:nums) {
            if(max[0] == num){
                ++max[1];
                continue;
            }
            if(max[1] == 0){
                max[0] = num;
                max[1]++;
                continue;
            }
            max[1]--;
        }
        return max[0];
    }
}
