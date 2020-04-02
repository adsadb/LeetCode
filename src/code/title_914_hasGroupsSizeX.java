package code;

import java.util.HashMap;

public class title_914_hasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        int num[] = new int[10001];
        for (int a:deck) {
            num[a]++;
        }
        int a = 0;
        int b = 0;
        for(int i = 0;i < num.length;i++){
            if(num[i] != 0){
                a = num[i];
                int gcd = gcd(a,b);
                if(gcd==0)return false;
                b = gcd;
            }
        }
        return true;
    }
    public int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}
