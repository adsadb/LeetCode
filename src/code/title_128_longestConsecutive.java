package code;

import java.util.HashSet;

public class title_128_longestConsecutive {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if(!set.contains(num-1)){
                int count = 0;
                while(set.contains(num)){
                    num++;
                    count++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }

}
