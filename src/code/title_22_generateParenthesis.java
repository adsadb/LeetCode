package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class title_22_generateParenthesis {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n,n,"");
        return res;
    }
    private void dfs(int left, int right, String curStr){
        if(left == 0 && right == 0){
            res.add(curStr);
            return;
        }
        if(left > 0){
            dfs(left-1,right,curStr+'(');
        }
        if(left < right){
            dfs(left,right-1,curStr+')');
        }
    }
}
