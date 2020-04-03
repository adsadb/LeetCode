package code;

public class title_64_minPathSum {
    public int minPathSum(int[][] grid) {
        int lenx = grid.length;
        int leny = grid[0].length;
        for(int i = 0;i < lenx;i++){
            for(int j = 0;j < leny;j++){
                if(i == 0){
                    grid[i][j] += j ==  0 ? 0 : grid[i][j-1];
                    continue;
                }
                if(j == 0){
                    grid[i][j] += i ==  0 ? 0 : grid[i-1][j];
                    continue;
                }
                grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[lenx-1][leny-1];
    }
}
