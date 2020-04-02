package code;
//2:活->死  -1：死->活
public class title_289_gameOfLife {
    public void gameOfLife(int[][] board) {
        int lenx = board.length;
        int leny = board[0].length;
        int x[] = {-1,-1,-1,0,0,1,1,1};
        int y[] = {-1,0,1,-1,1,-1,0,1};
        for(int i = 0;i < lenx;i++){
            for(int j = 0;j < leny;j++){
                int live = 0;
                for(int k = 0;k < 8;k++){
                    int New_X = i+x[k];
                    int NeW_Y = j+y[k];
                    if(New_X<0 || New_X>=lenx || NeW_Y<0 || NeW_Y>=leny)continue;
                    if(board[New_X][NeW_Y] > 0)live++;
                }
                if(board[i][j] == 0)board[i][j] = live==3?-1:0;
                if(board[i][j] == 1)board[i][j] = live<2||live>3?2:1;
            }
        }
        for(int i = 0;i < lenx;i++){
            for(int j = 0;j < leny;j++){
                if(board[i][j] == 2)board[i][j] = 0;
                if(board[i][j] == -1)board[i][j] = 1;
            }
        }
    }
}
