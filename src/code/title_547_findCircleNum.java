package code;

import java.util.LinkedList;
import java.util.Queue;

public class title_547_findCircleNum {
    public int findCircleNum(int[][] M) {
        if(M.length == 0 || M[0].length == 0)return 0;
        int count = 0;
        int visited[] = new int[M.length];
        LinkedList<Integer> queues = new LinkedList<>();
        for(int i = 0;i < M.length;i++){
            if(visited[i] == 0){
                queues.add(i);
                while(!queues.isEmpty()){
                    int m = queues.remove();
                    visited[m] = 1;
                    for(int j = 0;j < M.length;j++){
                        if(M[m][j] == 1 && visited[j] == 0){ //M[m][j]  不是M[i][j]
                            visited[j] = 1;
                            queues.add(j);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }


    //深度优先遍历
    /*private int dfs(int[][] M,int[] visited,int i){
        for(int j = 0;j < M.length;j++){
            if(M[i][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                dfs(M,visited,j);
            }
        }
        return 0;
    }
    public int findCircleNum(int[][] M) {
        if(M.length == 0 || M[0].length == 0)return 0;
        int count = 0;
        int visited[] = new int[M.length];
        for(int i = 0;i < M.length;i++){
            if(visited[i] == 0){
                dfs(M,visited,i);
                count++;
            }
        }
        return count;
    }*/
}
