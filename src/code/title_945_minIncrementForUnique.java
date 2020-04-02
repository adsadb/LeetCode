package code;

import java.util.HashMap;
import java.util.Map;

public class title_945_minIncrementForUnique {
    public int minIncrementForUnique(int[] A) {
        if(A.length < 2)return 0;
        int count = 0;
        int max = 0;
        int num[] = new int[40001];
        for (int a:A) {
            num[a]++;
            max = Math.max(max,a);
        }
        for(int i = 0;i < max;i++){
            if(num[i] > 1){
                num[i+1] += num[i] - 1;
                count += num[i] - 1;
            }
        }
        if(num[max] > 1)count += (num[max] * num[max] - num[max])/2;

        return count;
    }
}
