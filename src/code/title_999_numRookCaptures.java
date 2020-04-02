package code;

public class title_999_numRookCaptures {
    public int numRookCaptures(char[][] board) {
        int res = 0;
        int rx[] = {1,-1,0,0};
        int ry[] = {0,0,1,-1};
        for(int i = 0;i < 8;i++){
            for (int j = 0;j < 8;j++){
                if(board[i][j] == 'R'){
                    for(int k = 0;k < 4;k++){
                        int x = i,y = j;
                        while(true){
                            x += rx[k];
                            y += ry[k];
                            if(x < 0 || x > 7 || y <0 || y > 7 || board[x][y] == 'B')break;
                            if (board[x][y] == 'p'){
                                res++;
                                break;
                            }
                        }
                    }
                    return res;
                }
            }
        }
        return res;
    }
}
