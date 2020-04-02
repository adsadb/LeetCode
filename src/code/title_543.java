package code;

public class title_543 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    class Solution {
        int max_height = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null)return 0;
//            if(root.left == null && root.right == null)return 0;
            return diameterOfBinaryTree(root,0);
        }
        public int diameterOfBinaryTree(TreeNode root, int n){
            if(root.left == null && root.right == null)return 0;
            return Math.max(diameterOfBinaryTree(root.left, n)+diameterOfBinaryTree(root.right, n)+1, max_height);
        }
    }
}
