package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class title_207_canFinish {
//思想虽然一样，但是用栈替代递归没有做出来
    //有时间再做一次
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        int[] flags = new int[numCourses];
        for(int[] cp : prerequisites)
            adjacency.get(cp[1]).add(cp[0]);
        for(int i = 0; i < numCourses; i++)
            if(!dfs(adjacency, flags, i)) return false;
        return true;
    }
    private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {
        if(flags[i] == 1) return false;
        if(flags[i] == -1) return true;
        flags[i] = 1;
        for(Integer j : adjacency.get(i))
            if(!dfs(adjacency, flags, j)) return false;
        flags[i] = -1;
        return true;
    }
    public static void main(String [] args){
        title_207_canFinish test = new title_207_canFinish();
        test.canFinish(2 ,new int[][]{{1,0},{0,1}});
    }

//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        boolean visited[] = new boolean[numCourses];
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i = 0;i < numCourses;i++){
//            list.add(new ArrayList<>());
//        }
//        for (int a[]:prerequisites) {
//            list.get(a[0]).add(a[1]);
//        }
//        for(int i = 0;i < prerequisites.length;i++){
//            if(!visited[i]) {
//                Stack<Integer> stack = new Stack<>();
//                stack.push(prerequisites[i][1]);
//                while(!stack.empty()){
//                    if(visited[stack.peek()])return false;
//                    visited[stack.peek()] = true;
//                    List<Integer> a = list.get(stack.pop());
//                    for (int index:a) {
//                        stack.push(index);
//                    }
//                }
//            }
//        }
//        return true;
//    }
}
