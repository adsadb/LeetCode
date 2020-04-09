package code;

import java.util.Stack;

public class title_01_07_rotate {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0)return;
        int len = matrix.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i < len;i++){
            for(int j = i+1;j < len;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int x = len >> 1;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < x;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }
        }

    }
}
