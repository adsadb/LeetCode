package code;

import java.util.Stack;

//不对
public class title_1111_maxDepthAfterSplit {
    public int[] maxDepthAfterSplit(String seq) {
        int len = seq.length();
        if(len == 0)return new int[] {0};
        int depth = 0,index = 1;
        int res[] = new int[len];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.empty()){
            if(index == len)break;
            if(seq.charAt(index) == '('){
                stack.push(index++);
                depth++;
                continue;
            }
            if(seq.charAt(index) == ')'){
                int x = stack.pop();
                res[x] = res[index++] = depth--;
            }
        }
        return res;
    }

}
