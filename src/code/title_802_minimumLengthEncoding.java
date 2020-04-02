package code;

import java.util.Arrays;

public class title_802_minimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        int num = 0;
        trie trie = new trie();
        Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
        for (String s:words) {
            num += trie.insert(s);
        }
        return num;
    }
    class TrieNode{
        char val;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){}
        public TrieNode(char c){
            val = c;
        }
    }
    class trie{
        TrieNode root;
        public trie(){
            root = new TrieNode();
        }
        public int insert(String s){
            TrieNode cur = root;
            boolean flag = false;
            for(int i = s.length()-1;i >= 0;i--){
                int index = s.charAt(i) - 'a';
                if(cur.children[index] == null){
                    flag = true;
                    cur.children[index] = new TrieNode();
                }
                cur = cur.children[index];
            }
            return flag?s.length()+1:0;
        }
    }
}
