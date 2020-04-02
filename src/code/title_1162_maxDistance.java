package code;

import java.util.ArrayDeque;
import java.util.Queue;

public class title_1162_maxDistance {
    public int maxDistance(int[][] grid) {
        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,1,-1};
        Queue<int []> queue = new ArrayDeque<>();
        int n = grid.length, m = grid[0].length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 1)queue.add(new int[] {i,j});
            }
        }

        boolean hasOcean = false;
        int [] poll = null;
        while(!queue.isEmpty()){
            poll = queue.poll();
            int x = poll[0],y = poll[1];
            for(int i = 0;i < 4;i++){
                int newX = x + dx[i], newY = y + dy[i];
                if(newX < 0 || newX >= n || newY < 0 || newY >= n || grid[newX][newY] != 0)continue;
                hasOcean = true;
                grid[newX][newY] = grid[x][y] + 1;
                queue.offer(new int[] {newX,newY});
            }
        }
        if(!hasOcean || poll == null)return -1;
        return grid[poll[0]][poll[1]] - 1;
    }
}
