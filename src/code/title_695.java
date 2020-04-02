package code;

public class title_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 1)max = Math.max(max,maxAreaDFS(grid,i,j));
            }
        }
        return max;
    }
    private int maxAreaDFS(int [][] grid, int i, int j){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0)return 0;
        int sum = 1;
        grid[i][j] = 0;
        sum += maxAreaDFS(grid,i,j-1);
        sum += maxAreaDFS(grid,i+1,j);
        sum += maxAreaDFS(grid,i,j+1);
        sum += maxAreaDFS(grid,i-1,j);
        return sum;
    }
}
