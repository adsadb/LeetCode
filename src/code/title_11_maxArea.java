package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class title_11_maxArea {
    public int maxArea(int[] height) {
        int len = height.length;
        int i = 0,j = len - 1;
        int max = -1;
        while(i < j){
            int nowArea = (j - i + 1) * Math.max(height[i],height[j]);
            max = Math.max(max,nowArea);
            if(height[i] > height[j])j++;
            else i++;
        }
        return max;
    }
}
