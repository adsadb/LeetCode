package code;

public class title_365_canMeasureWater {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) return true;
        if (x + y < z) return false;

        int big = Math.max(x, y);
        int small = x + y - big;

        if (small == 0) return big == z;


        while (big % small != 0) {
            int temp = small;
            small = big % small;
            big = temp;
        }
        return z % small == 0;
    }
}
