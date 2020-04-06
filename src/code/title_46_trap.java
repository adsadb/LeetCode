package code;

import java.util.List;
import java.util.Stack;


public class title_46_trap {
    public int trap(int[] height) {
        int len = height.length;
        if(len == 0 || len == 1)return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int ans = 0;
        while(height[i] == 0){
            i++;
        }
        stack.push(i++);
        for(;i < len;i++){
            while(!stack.empty() && height[i] >= height[stack.peek()]){
                int temp = stack.pop();
                while (!stack.isEmpty() && height[stack.peek()] == height[temp]) { //避免重复计算高度相同的
                    stack.pop();
                }
                if(stack.empty())continue;
                ans += (Math.min(height[i],height[stack.peek()]) - height[temp]) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        title_46_trap test = new title_46_trap();
        int data[] = new int[] {2,0,2};
        System.out.println(test.trap(data));
    }
}
