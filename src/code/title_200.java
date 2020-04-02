package code;

public class title_200 {
    public int numIslands(char[][] grid) {
        int max = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                    max++;
                    maxAreaDFS(grid,i,j);
                }
            }
        }
        return max;
    }
    private void maxAreaDFS(char [][] grid, int i, int j){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 ||grid[i][j] =='0')return;
        grid[i][j] = '0';
        maxAreaDFS(grid,i,j-1);
        maxAreaDFS(grid,i+1,j);
        maxAreaDFS(grid,i,j+1);
        maxAreaDFS(grid,i-1,j);
    }
}
