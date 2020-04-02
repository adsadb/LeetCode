package code;

import java.util.Arrays;

public class title_345 {
    class Solution {
        public boolean isOrigin(char s){
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
                return true;
            }
            if(s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
                return true;
            }
            return false;
        }
        public void swap(char a[],int i,int j){
            char sw = a[i];
            a[i] = a[j];
            a[j] = sw;
        }
        public String reverseVowels(String s) {
            int i = 0,j = s.length();
            char ch[] = s.toCharArray();
            while(i < j){
                if(!isOrigin(ch[i])){
                    i++;
                    continue;
                }
                if(!isOrigin(ch[j])){
                    j--;
                    continue;
                }
                swap(ch,i++,j--);
            }
            return String.valueOf(ch);
        }
    }
}
