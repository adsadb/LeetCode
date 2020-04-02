package code;
//Kadanes算法
//算一个 最大连续数组和 maxTillTotal
//       最小连续数组和 minTillTotal
//      sum
//如果 sum == maxTillTotal ：说明数组里面的数全为负数，输出最大连续maxTillTotal
//否则 输出max（maxTillTotal，sum-minTillTotal）
public class title_918 {
    public int maxSubarraySumCircular(int[] A) {
        int maxTillHere = 0;
        int maxTillTotal = A[0];
        int minTillHere = 0;
        int minTillTotal = A[0];
        int sum = 0;
        for (int a:A) {
            maxTillHere = a + Math.max(maxTillHere,0);
            maxTillTotal = Math.max(maxTillHere,maxTillTotal);
            minTillHere = a + Math.min(minTillHere,0);
            minTillTotal = Math.min(minTillHere,minTillTotal);
            sum += a;
        }
        if(sum == minTillTotal)return maxTillTotal;
        return Math.max(maxTillTotal,sum - minTillTotal);
    }
    public static void main(String[] args){
        int[] a = {5-3,5,-5,-4,5};
        title_918 title_918 = new title_918();
        int max = title_918.maxSubarraySumCircular(a);
        System.out.println(max);
    }
}
