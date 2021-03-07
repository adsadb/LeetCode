package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class test_13 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        boolean flag = false;
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node == null){
                res.add(temp);
                temp.clear();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }else{
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test_13 test = new test_13();
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        node1.right = node;
        test.levelOrder(node1);
    }
}
