package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class title_133_cloneGraph {
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    /*
    HashMap visted 代表节点Node是否被访问过，
        第一个Node指原图的节点
        第二个Node指clone的节点（在加入HashMap时会new一个新的节点）
     */

//深度优先搜索
   /* private HashMap<Node,Node> visted = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null)return node;
        if(visted.containsKey(node))return visted.get(node);
        Node cloneNode = new Node(node.val,new ArrayList<>());
        visted.put(node,cloneNode);

        for (Node neighbor:node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }*/

   //广度优先搜索
    public Node cloneGraph(Node node) {
        if(node == null)return node;
        HashMap<Node,Node> visted = new HashMap<>();
        visted.put(node,new Node(node.val,new ArrayList<>()));
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node p = queue.remove();
            for (Node neighbor:p.neighbors) {
                if(!visted.containsKey(neighbor)){
                    visted.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
                    queue.add(neighbor);
                }
                visted.get(p).neighbors.add(visted.get(neighbor));
            }
        }
        return visted.get(node);
    }
}
