package code;

public class title_63_uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null)return 0;
        int lenx = obstacleGrid.length;
        int leny = obstacleGrid[0].length;
        if(lenx == 0 || leny == 0)return 1;
        if(obstacleGrid[lenx-1][leny-1] == 1)return 0;
        boolean flagX = false,flagY = false;
        for(int i = 0;i < lenx;i++){
            for(int j = 0;j < leny;j++){
                if(obstacleGrid[i][j] == 0){
                    if(i == 0){
                        obstacleGrid[i][j] = flagX ? 0 : -1;
                        continue;
                    }
                    if(j == 0){
                        obstacleGrid[i][j] = flagY ? 0 : -1;
                        continue;
                    }
                    int temp1 = obstacleGrid[i-1][j]==1?0:obstacleGrid[i-1][j];
                    int temp2 = obstacleGrid[i][j-1]==1?0:obstacleGrid[i][j-1];
                    obstacleGrid[i][j] = temp1 + temp2;
                }
                if(obstacleGrid[i][j] == 1){
                    if(i==0)flagX = true;
                    if(j==0)flagY = true;
                }
            }
        }
        return -obstacleGrid[lenx-1][leny-1];
    }
}
