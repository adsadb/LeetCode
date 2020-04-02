package code;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class title_ms_40 {
//    public int[] getLeastNumbers(int[] arr, int k) {
//        if (k == 0 || arr.length == 0)return new int[0];
//        if(arr.length < k)return arr;
//
//    }
//    private int[] quickSort(int[] arr, int low, int high, int k){
//        int i =
//    }
//    private int partition(int[] arr, int low, int high){
//        int v = arr[low];
//        int i = low,j = high + 1;
//
//
//    }

    /*
    大根堆实现方式
     */
//    public int[] getLeastNumbers(int[] arr, int k) {
//        if(arr.length == 0 || arr == null || k == 0)return new int[0];
//        Queue<Integer> pq = new PriorityQueue<>((val1,val2) -> val2 - val1);
//
//        for (int num:arr) {
//            if(pq.size() < k)pq.offer(num);
//            else if(num < pq.peek()){
//                pq.poll();
//                pq.offer(num);
//            }
//        }
//        int res[] = new int[pq.size()];
//        int index = 0;
//        for (int a:pq) {
//            res[index++] = a;
//        }
//        return res;
//    }

}
