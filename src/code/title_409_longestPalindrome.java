package code;

import java.util.HashMap;
import java.util.Map;

public class title_409_longestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null)return 0;
        char ch[] = s.toCharArray();
        int count[] = new int[58];
        for (char a:ch) {
            count[a - 64]++;
        }
        int num = 0;
        int center = 0;
        for (int c:count) {
            if(c % 2 == 0){
                num += c;
            }else{
                num += c - 1;
                center = 1;
            }
        }

        return num + center;
    }
}
