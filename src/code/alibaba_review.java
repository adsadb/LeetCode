package code;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class alibaba_review {

//        public static void main(String args[]){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int num = 0;
//            boolean map[] = new boolean[n];
//            int set[] = new int[n];
//            while(num == n-1){
//
//                for(int i = 1;i <= n;i++){
//                    if(map[i] = true)continue;
//                    set[num++] = i;
//                    map[i] = true;
//                    if(num <= 2)continue;
//                    if(!test(set,num)){
//                        set[num--] = 0;
//                        map[i] = false;
//                    }
//                }
//            }
//        }
//        public static boolean test(int set[],int num){
//            for(int i = 1;i < num;i++){
//                for(int j = i;j < num;j++){
//                    for(int k = j;k < num;k++){
//                        if(set[j] == (set[i] + set[j])/2)return false;
//                    }
//                }
//            }
//            return true;
//        }

    public static void main(String[] args) {
        alibaba_review alibaba_review = new alibaba_review();
        alibaba_review.numOfWays(50);
    }
    int res = 0;
    public int numOfWays(int n) {

        helper(new int[n][3],0,0);
        System.out.println(res);
        return res;
    }

    private void helper(int[][] grid,int x,int y){
        if(x == grid.length){
            res++;
            return;
        }
        for(int i = 1;i <= 3;i++){
            if((x-1 >= 0 && grid[x-1][y] == i) || (y-1 >= 0 && grid[x][y-1] == i)){
                continue;
            }
            grid[x][y] = i;
            if(y == 2){
                helper(grid,x+1,0);
            }else{
                helper(grid,x,y+1);
            }
            grid[x][y] = 0;
        }
    }
}
