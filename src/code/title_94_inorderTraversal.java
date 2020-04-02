package code;

import java.util.LinkedList;
import java.util.List;

public class title_94_inorderTraversal {

      //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            traversal(root,list);
            return list;
        }
        public void traversal(TreeNode root, List<Integer> list){
            if(root == null)return;
            if(root.left != null)traversal(root.left,list);
            list.add(root.val);
            if(root.right != null)traversal(root.right,list);
            return;
        }
    }
}
