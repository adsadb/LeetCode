package code;

public class title_329_longestIncreasingPath {
    public static void main(String[] args) {
        title_329_longestIncreasingPath title_329_longestIncreasingPath = new title_329_longestIncreasingPath();
        int[][] data = {{9,9,4},{6,6,8},{2,1,1}};
        int i = title_329_longestIncreasingPath.longestIncreasingPath(data);
        System.out.println(i);
    }

    int[][] dicts = {{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }

        int lenx = matrix.length, leny = matrix[0].length;
        int[][] memory = new int[lenx][leny];
        int res = 0;

        for(int i = 0;i < lenx;i++){
            for(int j = 0;j < leny;j++){
                int temp = helper(matrix,i,j,memory);
                res = Math.max(res,temp);
            }
        }
        return res;
    }

    private int helper(int[][] matrix,int x,int y,int[][] memory){
        if(memory[x][y] != 0){
            return memory[x][y];
        }
        int lenx = matrix.length, leny = matrix[0].length;
        memory[x][y]++;
        for(int[] dict : dicts){
            int newX = x + dict[0], newY = y + dict[1];
            if(newX >= 0 && newX < lenx && newY >= 0 &&
                    newY < leny && matrix[newX][newY] > matrix[x][y]){
                memory[x][y] = Math.max(memory[x][y], helper(matrix,newX,newY,memory) + 1);
            }
        }
        return memory[x][y];
    }
}
