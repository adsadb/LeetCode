package test;

public class test_1 {
    public boolean checkInclusion(String s1, String s2) {
        int map[] = new int[26];
        for(int i = 0;i< s1.length();i++){
            map[s1.charAt(i)-'a']++;
        }
        for(int i = 0;i< s2.length();i++){
            int temp[] = map.clone();
            if(check(s2.substring(i,s2.length()),temp,s1.length()))return true;
        }
        return false;
    }
    private boolean check(String s2,int[] temp,int len){
        int num = 0;
        for(int i = 0;i < s2.length();i++){
            int index = s2.charAt(i)-'a';
            if(temp[index] == 0)return false;
            temp[index]--;
            if(++num == len)return true;
        }
        return false;
    }
    int[] merge(int[] a, int[] b){
        int len_a = a.length,len_b = b.length;
        int len1 = 0,len2 = 0;
        int num = 0;
        int res[] = new int[len_a+len_b];
        while(len1 < len_a && len2 < len_b){
            if(a[len1] < b[len2]){
                res[num++] = a[len1++];
            }else{
                res[num++] = b[len2++];
            }
        }
        if(len2 < len_b){
            len1 = len2;
            len_a = len_b;
            a = b;
        }
        for(int i = len1;i<len_a;i++){
            res[num++] = a[i];
        }
        return res;
    }



    public static void main(String[] args) {
        test_1 test_1 = new test_1();
        System.out.println(test_1.checkInclusion("adc","dcda"));
    }
}
