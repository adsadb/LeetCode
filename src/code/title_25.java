package code;
//递归解决链表每K个节点反转，不足不反转
public class title_25 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while(cur != null && count != k){
            cur = cur.next;
            count++;
        }
        if(count == k){
            cur = reverseKGroup(cur,k);
            while(count != 0){
                count--;
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                head = tmp;
            }
            return cur;
        }
        return head;
    }
}
