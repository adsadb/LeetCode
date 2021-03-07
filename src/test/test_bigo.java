package test;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class test_bigo {

        public static class list_node{
            list_node(int val){
                this.val = val;
            }
            int val;
            list_node next;
        };
        public static boolean test(list_node list){
            if(list == null || list.next == null)return false;
            list_node fast = list.next;
            list_node low = list;
            while(low != null && fast.next != null){
                if(low == fast)return true;
                low = low.next;
                fast = fast.next.next;
            }
            return false;
        }
        public static void main(String[] args) {
            //Scanner in = new Scanner(System.in);
            //int a = in.nextInt();
            //System.out.println(a);
            Scanner in = new Scanner(System.in);

            list_node list = null;
            list_node cur = new list_node(-1);
            int num = in.nextInt();
            while(in.hasNext()){
                list_node node = new list_node(in.nextInt());
                cur.next = node;
                cur = node;
            }

            System.out.println(test(list));
        }

    List<int[]> merge(List<int[]> list) {
        list.sort((val1,val2)->val1[0] - val2[0]);
        List<int[]> res = new LinkedList<>();
        int temp[] = new int[2];
        temp = list.get(0);
        for(int i = 1; i < list.size()-1;i++){
            if(temp[1] > list.get(i+1)[0]){
                temp[1] = Math.max(temp[1],list.get(i+1)[1]);
            }else{
                res.add(temp);
                temp = list.get(i+1);
            }
        }
        return res;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    TreeNode buildTree(int[] preOrder, int[] inOrder) {
//        TreeNode res = new TreeNode(preOrder[0]);
//        int index = 0;
//        for(int i = 0;i < inOrder.length){
//            if(inOrder[i] == preOrder[0])index = i;
//        }
//        buildTree()
//
//    }
//    TreeNode buildTree(int[] preOrder, int[] inOrder,int low ,int high){
//
//    }

//    int[] sorted(int[] data,int i ,int j,int m,int n){
//        int res[] = new int[data.length];
//        while(i>j || m>n){
//
//        }
//
//    }
//    int[] helper(int data,)
}
