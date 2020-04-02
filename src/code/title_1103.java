package code;

public class title_1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int res[] = new int[num_people];
        int n = 1,i = 0,j = 0;
        while(candies > 0){
            i = i>num_people-1?0:i;
            res[i++] += (candies>n?n:candies);
            candies -= n++;
            System.out.println(res[0]);
        }

        return res;
    }
//    public static void main(String[] args){
//        title_1103 test = new title_1103();
//        int num[] = test.distributeCandies(10,3);
//
//    }
}

