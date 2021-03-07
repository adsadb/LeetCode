//package code;
//
//import java.util.HashMap;
//import java.util.List;
//
//public class didi {
////    public static void main(String[] args) {
////        int nums[] = new int[]{1,2,3,4};
////        System.out.println(test(nums,1));
////    }
//    public static int test(int[] nums, int target){
//        int right = nums.length - 1, left = 0;
//        while(right >= left){
//            int mid = left + (right - left) / 2;
//            if(nums[mid] == target)return mid;
//            if(nums[mid] > target){
//                right = mid - 1;
//            }else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    public static class ListNode{
//        int val;
//        ListNode next;
//        ListNode(int val, ListNode next){
//            this.val = val;
//            this.next = next;
//        }
//    }
//    public static ListNode test1(ListNode list){
//        ListNode node = new ListNode(0,list);
//        list = list.next;
//        while(list != null){
//            ListNode temp = node.next;
//            node.next = list;
//            list.next = temp;
//            node = node.next;
//        }
//        return node.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode node = new ListNode(0,null);
//        for (int i = 0; i < 5; i++) {
//            node.next = new ListNode(i,null);
//        }
//        ListNode res = test1(node.next);
//        while(res != null){
//            System.out.println(res.val);
//            res = res.next;
//        }
//    }
//    select name ,sum(score) from table group by name order by sum(score) desc limit 10;
//}
