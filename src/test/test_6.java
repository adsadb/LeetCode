package test;

import java.util.*;

public class test_6 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Stack<Integer> stack = new Stack<>();
//        PriorityQueue<Integer> queue = new PriorityQueue<>((v1,v2) -> v1-v2);
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int count = 1;
                while(set.contains(currentNum)){
                    currentNum++;
                    count++;
                }
                res = Math.max(res,currentNum);
            }
        }
        return res;
    }
}
