package code;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class title_59 {
    class MaxQueue {
        Queue<Integer> queue;
        Deque<Integer> sup_que;
        public MaxQueue() {
            Queue<Integer> queue = new LinkedList<Integer>();
            Deque<Integer> sup_que = new LinkedList<Integer>();
        }

        public int max_value() {
            if(sup_que.peekFirst() == null)return -1;
            return sup_que.peekFirst();
        }

        public void push_back(int value) {
            while(sup_que.peekFirst() != null && sup_que.peekLast() > value){
                sup_que.pollLast();
            }
            sup_que.offerLast(value);
            queue.offer(value);
        }

        public int pop_front() {
            if(queue.peek() == null)return -1;
            if(queue.peek().equals(sup_que.peekFirst()))sup_que.pollFirst();
            return queue.poll();
        }
    }

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
}
