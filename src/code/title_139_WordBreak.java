package code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class title_139_WordBreak {
    //O(n²)
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<String>();
        for(String str : wordDict){
            set.add(str);
        }
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int lo = 0; lo < s.length();lo++){
            for(int hi = lo;hi <= s.length();hi++){
                if(dp[lo] && set.contains(s.substring(lo,hi))){
                    dp[hi] = true;
                }
            }
        }
        return dp[s.length()];
    }
    //有想应得一个优化
    public boolean wordBreak1(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int lo = 0; lo < s.length();lo++){
            if(!dp[lo])continue;
            //不是一个字母一个字母取值，直接取字典中字符串的大小
            for(String str : wordDict){
                int index = lo+str.length();
                if(index <= s.length() && s.substring(lo,index).equals(str)){
                    dp[index] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
