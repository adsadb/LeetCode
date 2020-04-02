package code;

import java.util.HashMap;
import java.util.Map;

public class title_1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>(32);
        int num = 0;
        for (char a:chars.toCharArray()) {
            map.put(a,map.get(a)==null?1:map.get(a)+1);
        }
        for (int i = 0;i < words.length;i++){
            Map<Character,Integer> word = new HashMap<>(32);
            boolean flag = true;
            for (char c:words[i].toCharArray()) {
                int word_num = word.get(c)==null?1:word.get(c)+1;
                word.put(c,word_num);
                if(map.get(c) == null || word_num > map.get(c)){
                    flag = false;
                    break;
                }
                for (char s:word.keySet()) {
                    System.out.println(s + "  " +word.get(s));
                }
            }
            num += flag?words[i].length():0;
        }
        return num;
    }
    public static void main(String arg[]){
        String[] words = {"abcabcabcabc"};
        String chars = "abcabcabcabc";
        title_1160 title_1160 = new title_1160();

        System.out.println(title_1160.countCharacters(words,chars));
    }
}
