package code;

import java.util.Arrays;

public class title_1370 {
    public String sortString(String s) {
        int len = s.length();
        if(len == 0)return s;
        int map[] = new int[26];
        for (int i = 0; i < len; ++i) {
            ++map[s.charAt(i) - 'a'];
        }
        s = "";
        int x = 0, i;
        while (x < len) {
            for (i = 0; i < 26; ++i) {
                if (map[i] > 0) {
                    s += (char)('a' + i);
                    x++;
                    --map[i];
                }
            }
            for (i = 25; i >= 0; --i) {
                if (map[i] > 0) {
                    s += (char)('a' + i);
                    x++;
                    --map[i];
                }
            }
        }
        return s;
    }

//        public String sortString(String s) {
//            char a[] = s.toCharArray();
//            char b[] = new char[s.length()];
//            Arrays.sort(a);
//            s.charAt()
//            s = "";
//            while(a.length == 0 && b.length == 0){
//                processString(a,b,s);
//            }
//            return s;
//        }
//        public void processString(char a[], char b[], String s){
//            char c = '/';
//            int num = 0;
//            for(int i = 0;i < a.length;i++){
//                if(a[i] == c){
//                    b[num++] = c;
//                    continue;
//                }
//                s += a[i];
//                c = a[i];
//            }
//            c = '/';
//            num = 0;
//            a = null;
//            for(int j = b.length-1;j > 0;j--){
//                if(b[j] == c){
//                    a[num++] = c;
//                    continue;
//                }
//                s += b[j];
//                c = b[j];
//            }
//        }
//    public static void main(String [] args){
//        title_1370 title_1370 = new title_1370();
//        title_1370.sortString("abccbaabccba");
//    }
}
