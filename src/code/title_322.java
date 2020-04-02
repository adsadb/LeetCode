package code;

import java.util.Arrays;

public class title_322 {
    //贪心算法 + dfs
    //每次取出当前coin第N大的值，求其现在最多选择数量
    //贪心算法得到的不是最优解，需要将所有的解得出之后比较得到
    class Solution {
        int ans = Integer.MAX_VALUE;
        public int coinChange(int[] coins, int amount) {
            Arrays.sort(coins);
            coinChange(coins.length-1, coins, 0, amount);
            //如果ans的值改变就代表是有相应解，输出即可。否则就输出-1代表无解
            return ans == Integer.MAX_VALUE?-1:ans;
        }
        //index
        public void coinChange(int index, int[] coins, int count, int amount){
            //当剩余数量amount==0时就设置ans
            if(amount == 0){
                ans = count;
                return;
            }
            if(index < 0){
                return;
            }
            //计算当前coins[index]做多能有多少个
            int i = amount / coins[index];
            //count+k < ans很重要，能剪枝，同时也避免了重复操作造成的错误
            for(int k = i;k >= 0 && count+k < ans;k--){
                //将去除当前最大的硬币后，所剩余的amount重新带入方法
                coinChange(index-1,coins,count+k,amount-k*coins[index]);
            }
        }
    }
}
