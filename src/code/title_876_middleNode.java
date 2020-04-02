package code;

public class title_876_middleNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p = head;
        ListNode q = head;
        int num = 0;
        while(p.next != null){
            num++;
            if(num % 2 == 0)q = q.next;
            p = p.next;
        }
        if(num % 2 == 1)return q.next;
        return q;
    }
}
