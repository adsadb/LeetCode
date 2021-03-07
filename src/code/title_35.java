package code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class title_35 {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if(!wordList.contains(endWord)){
                return 0;
            }
            return helper(beginWord, endWord, wordList, 0);
        }
        private int helper(String nowWord, String endWord, List<String> wordList, int num){
            if(nowWord.equals(endWord)){
                return num;
            }

            for (int i = 0; i < wordList.size(); i++) {
                String word = wordList.get(i);
                int tmpNum = 0;
                if(isNext(nowWord,word)){
                    List<String> temp = wordList;
                    temp.remove(i);
                    tmpNum = Math.min(tmpNum, helper(word,endWord,temp,num+1));
                }
            }
            return 0;
        }
        private boolean isNext(String nowWord, String nextWord){
            int lenNow = nowWord.length();
            int lenNext = nextWord.length();
            boolean res = true;
            if(lenNext != lenNow)return false;
            for (int i = 0; i < lenNow; i++) {
                if(nextWord.charAt(i) != nowWord.charAt(i)){
                    if(!res){
                        return res;
                    }
                    res = false;
                }
            }
            return res;
        }
    }
}
