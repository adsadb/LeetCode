package code;

import java.util.*;

public class title_841_canVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        Stack<List<Integer>> stack = new Stack<>();
        stack.push(rooms.get(0));
        while(!stack.empty()){
            List<Integer> list = stack.pop();
            for (int n:list){
                if(!visited[n]){
                    stack.push(rooms.get(n));
                    visited[n] = true;
                }
            }
        }
        for (boolean b : visited){
            if(!b)return false;
        }
        return true;
    }
}
