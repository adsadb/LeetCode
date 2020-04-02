package code;

public class title_70_climbStairs {
    public int climbStairs(int n) {
        int num[] = new int[] {1,2};
        if(n == 0)return 0;
        if(n < 3)return num[n-1];
        for(int i = 3;i <= n;i++){
            int b = num[0] + num[1];
            num[0] = num[1];
            num[1] = b;
        }
        return num[1];
    }
}
