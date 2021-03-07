package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class title_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int len = nums1.length > nums2.length ? nums1.length : nums2.length;
        int[] res = new int[len];
        HashSet set = new HashSet<>();
        for (int i1 : nums1) {
            set.add(i1);
        }
        int i = 0;
        for (int num : nums2) {
            if(set.contains(num)){
                res[i] = num;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
