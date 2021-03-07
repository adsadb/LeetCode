package code;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Test;

import java.util.Arrays;

public class title_279_numSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        Arrays.fill(dp,100000);
        int squre_max = (int)Math.sqrt(n) + 1;
        int[] squreNum = new int[squre_max];
        for(int i = 1;i < squre_max;i++){
            squreNum[i] = i * i;
        }
        for(int i = 1;i <= n;i++){
            for(int index = 1;index < squre_max;index++){
                if(i < squreNum[index])break;
                dp[i] = Math.min(dp[i-squreNum[index]]+1,dp[i]);
            }
        }
        return dp[1];
    }
    public int searchNum(int[] nums,int target){
        int len = nums.length;
        int mid;
        int low = 0,high = len;
        while(low < high){
            mid = (low + high) / 2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)low = mid + 1;
            else if(nums[mid] > target)high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        title_279_numSquares test = new title_279_numSquares();
        test.searchNum(new int[]{1,2,3,4,5,6},5);
    }
}
