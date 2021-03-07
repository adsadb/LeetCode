package code;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class title_347_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((v1, v2)->map.get(v1)-map.get(v2));
        for(int key : map.keySet()){
            if(queue.size() < k){
                queue.add(key);
            }else {
                if(map.get(key) > map.get(queue.peek())){
                    queue.remove();
                    queue.add(key);
                }
            }
        }
        int[] res = new int[k];
        int index = 0;
        while(!queue.isEmpty()){
            res[index++] = queue.remove();
        }
        return res;
    }
}
