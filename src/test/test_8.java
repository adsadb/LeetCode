package test;

import java.util.HashSet;

public class test_8 {
    public int getMex(int[] A, int n) {
        int min = 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int a:A){
            set.add(a);
        }
        while(!set.contains(min)){
            min++;
        }
        return min;
    }
}
