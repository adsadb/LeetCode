package code;

import java.util.HashMap;

public class title_1218_longestSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        int len = arr.length;
        if(len == 0)return 0;
        HashMap<Integer,Integer> map = new HashMap(len); //第一个Integer是arr的值，第二个是当前字序列最大长度
        int ans = -1;
        for (int x:arr) {
            int temp = map.getOrDefault(x-difference,0) + 1;
            map.put(x,temp);
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}
