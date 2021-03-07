//package code;
//
//import java.util.HashMap;
//
//public class title_146_LRUCache {
//    class node{
//        int key;
//        int val;
//        node pre;
//        node next;
//        public node(int key, int val){
//            this.key = key;
//            this.val = val;
//        }
//    }
//    node head;
//    node tail;
//    HashMap<Integer,node> map;
//    int size;
//    int capacity;
//    public LRUCache(int capacity) {
//        head = new node(0,0);
//        tail = new node(0,0);
//        head.next = tail;
//        tail.pre = head;
//        map = new HashMap<>();
//        size = 0;
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        if(!map.containsKey(key))return -1;
//        node de_node = map.get(key);
//        delete(de_node);
//        insert(de_node);
//        return de_node.val;
//    }
//
//    public void put(int key, int value) {
//        if(!map.containsKey(key)){
//            node de_node = map.get(key);
//            delete(de_node);
//            insert(de_node);
//        }else{
//            if(size+1 > capacity){
//                map.remove(tail.pre.key);
//                delete(tail.pre);
//            }
//            node new_node = new node(key,value);
//            map.put(key,new_node);
//            insert(new_node);
//        }
//    }
//
//    public void delete(node de_node){
//        node pre_node = de_node.pre;
//        node next_node = de_node.next;
//        pre_node.next = tail;
//        next_node.pre = head;
//        de_node.next = null;
//        de_node.pre = null;
//        size--;
//    }
//
//    public void insert(node de_node){
//        node head_next = head.next;
//        head.next = de_node;
//        de_node.pre = head;
//        de_node.next = head_next;
//        head_next.pre = de_node;
//        size++;
//    }
//}
