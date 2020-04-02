package code;

public class title_208_Trie {
    class Trie {
        private class TrieNode{
            private boolean isEnd;
            private TrieNode[] next;
            public TrieNode(){
                isEnd = false;
                next = new TrieNode[26];
            }
        }
        private TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode cur = root;
            char a[] = word.toCharArray();
            for(int i = 0;i < a.length;i++){
                int ch = a[i] - 'a';
                if(cur.next[ch] == null)cur.next[ch] = new TrieNode();
                cur = cur.next[ch];
            }
            cur.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode cur = root;
            char a[] = word.toCharArray();
            for(int i = 0;i < a.length;i++){
                int ch = a[i] - 'a';
                if(cur.next[ch] == null)return false;
                cur = cur.next[ch];
            }
            return cur.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            char a[] = prefix.toCharArray();
            for(int i = 0;i < a.length;i++){
                int ch = a[i] - 'a';
                if(cur.next[ch] == null)return false;
                cur = cur.next[ch];
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
