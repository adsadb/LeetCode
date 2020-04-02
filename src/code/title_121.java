package code;

public class title_121 {
        public int maxProfit(int[] prices) {
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
        }
    public static void main(String[] args){
        title_121 title_121 = new title_121();
        int a[] = {1,2};
        System.out.println(title_121.maxProfit(a));
    }
}

