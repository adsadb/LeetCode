package code;

public class title_121_maxProfit {
    public int maxProfit(int[] prices){
        if(prices == null || prices.length < 1)return 0;
        int len = prices.length;
        int minprice = prices[0],maxprofit = 0;
        for(int i = 1;i < len;i++){
            if(minprice > prices[i]){
                minprice = prices[i];
                continue;
            }
            maxprofit = Math.max(maxprofit,prices[i] - minprice);
        }
        return maxprofit;
    }
    /*public int maxProfit(int[] prices) {
            //栈
            int a[] = new int[prices.length];
            int n = 0;
            int max_num = -1;
            a[0] = prices[0];
            for(int i=1;i<prices.length;i++){
                while(n >= 0 && prices[i] < a[n]){
                    max_num = max_num>a[n]-a[0]?max_num:a[n]-a[0];
                    a[n--] = 0;
                }
                a[++n] = prices[i];
            }
            return max_num>a[n]-a[0]?max_num:a[n]-a[0];
        }*/
    public static void main(String[] args){
        title_121_maxProfit title_121_maxProfit = new title_121_maxProfit();
        int a[] = {1,2};
        System.out.println(title_121_maxProfit.maxProfit(a));
    }
}

