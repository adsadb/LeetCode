package code;

public class title_892_surfaceArea {
    public int surfaceArea(int[][] grid) {
        int len = grid.length;
        if(len == 0)return 0;
        int area = 0;
        for(int i = 0;i < len;i++){
            for (int j = 0;j < len;j++){
                int n = grid[i][j];
                if(n > 0) {
                    area += grid[i][j] * 4 + 2;
                    area -= i < len - 1 ? Math.min(grid[i][j], grid[i + 1][j]) * 2 : 0;
                    area -= j < len - 1 ? Math.min(grid[i][j], grid[i][j + 1]) * 2 : 0;
                }
            }
        }
        return area;
    }

    public static void main(String[] args){
        title_892_surfaceArea test = new title_892_surfaceArea();
        int [][] a = {{1,2},{3,4}};

        System.out.println(test.surfaceArea(a));
    }
}
