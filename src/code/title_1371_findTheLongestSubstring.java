package code;

import java.util.Arrays;

/**
 * @author yuan
 */
public class title_1371_findTheLongestSubstring {
    public int findTheLongestSubstring(String s) {
        int pos[] = new int[1<<5];
        Arrays.fill(pos,-1);
        int num = 0,state = 0;
        pos[0] = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                state ^= (1<<0);
            }else if(ch == 'e'){
                state ^= (1<<1);
            }else if(ch == 'i'){
                state ^= (1<<2);
            }else if(ch == 'o'){
                state ^= (1<<3);
            }else if(ch == 'u'){
                state ^= (1<<4);
            }
            if(pos[state] >= 0){
                num = Math.max(num,i+1-pos[state]);
            }else{
                pos[state] = i+1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        title_1371_findTheLongestSubstring test = new title_1371_findTheLongestSubstring();
        System.out.println(test.findTheLongestSubstring("aeetcode"));
    }
}
