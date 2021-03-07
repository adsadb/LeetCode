//package test;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class test_4 {
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        boolean flag =false;
//        if(root == null)return new ArrayList<List<Integer>>();
//        List<List<Integer>> res = new ArrayList<>();
//        LinkedList<Integer> level = new LinkedList<>();
//        queue.offer(root);
//        queue.offer(null);
//        bfs(queue,res,level,flag);
//        return res;
//    }
//    private void bfs(Queue<TreeNode> queue, List<List<Integer>> res, LinkedList<Integer> level,boolean flag){
//        if(queue.size() < 1)return;
//        TreeNode root = queue.poll();
//        if(root != null) {
//            if(flag)level.addFirst(root.val);
//                else level.addLast(root.val);
//            if (root.left != null) queue.offer(root.left);
//            if (root.right != null) queue.offer(root.right);
//        }
//        else{
//            if(queue.size() >= 1){
//                queue.offer(null);
//                flag = !flag;
//            }
//            res.add(level);
//            level = new LinkedList<Integer>();
//        }
//        bfs(queue,res,level,flag);
//    }
//
//    public static void main(String[] args) {
//        test_4 test = new test_4();
//        test.zigzagLevelOrder()
//    }
//}
