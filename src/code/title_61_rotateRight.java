package code;

import java.util.*;

public class title_61_rotateRight {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode res = new ListNode(-1);
        ListNode headNode = res;
        Deque<ListNode> queue = new LinkedList<>();
        while(head != null) {
            ListNode temp = head.next;
            head.next = null;
            queue.offer(head);
            head = temp;
        }
        for(int i = 0;i < k;i++){
            headNode.next = queue.pollLast();
            headNode = headNode.next;
        }
        while(!queue.isEmpty()){
            headNode.next = queue.pollFirst();
            headNode = headNode.next;
        }
        return head.next;
    }

    //每K个反转
//    public ListNode rotateRight(ListNode head, int k) {
//        ListNode res = new ListNode(-1);
//        ListNode headNode = res;
//        Stack<ListNode> stack = new Stack<>();
//        int num = 0;
//        while(head != null){
//            ListNode temp = head.next;
//            head.next = null;
//            stack.push(head);
//            head = temp;
//            num++;
//
//            if(num == k){
//                while(!stack.isEmpty()) {
//                    headNode.next = stack.pop();
//                    headNode = headNode.next;
//                }
//            }
//        }
//        while(!stack.isEmpty()) {
//            headNode.next = stack.pop();
//            headNode = headNode.next;
//        }
//        return res.next;
//    }
}
