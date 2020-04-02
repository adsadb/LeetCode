package code;

public class title_875 {
    public int minEatingSpeed(int[] piles, int H) {
        int max = 1;
        for (int p:piles) {
            max = Math.max(p,max);
        }
        int right = max;
        int left = 1;
        while (left < right){
            int mid = (left + right) >>> 1;
            if(!eatAllJudge(piles,mid,H)){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    private boolean eatAllJudge(int[] piples, int speed, int H){
        int sum = 0;
        for (int p:piples) {
            sum += (p + speed -1)/speed;
        }
        return sum>H?false:true;
    }
}
