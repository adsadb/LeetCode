package code;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class title_621_leastInterval {
    public int leastInterval(char[] tasks, int n) {
        int num[] = new int[26];
        for(char ch : tasks){
            num[ch-'A'] += 1;
        }
        Arrays.sort(num);

        int res = 0;
        while(num[25] > 0){
            int i = 0;
            while(i <= n){
                if(num[25] == 0)break;
                //判断下越界没
                if(25-i>=0 && num[25-i] > 0){
                    num[25-i]--;
                }
                i++;
                res++;
            }
            Arrays.sort(num);
        }
        return res;
    }
}
