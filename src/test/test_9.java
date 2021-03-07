package test;

import java.util.*;

public class test_9 {
    class Data{
        private int node1;
        private int node2;
        private int weight;

        public Data(int node1, int node2, int weight) {
            this.node1 = node1;
            this.node2 = node2;
            this.weight = weight;
        }

        public int getNode1() {
            return node1;
        }

        public void setNode1(int node1) {
            this.node1 = node1;
        }

        public int getNode2() {
            return node2;
        }

        public void setNode2(int node2) {
            this.node2 = node2;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
    public int[] getMin(int n, int[] A, int[] B, int[] C, int m, int s, int t) {
        // write code here
        List<Data> list = new ArrayList<>();
        for(int i = 0;i < m;i++){
            Data data = new Data(A[i],B[i],C[i]);
            list.add(data);
        }
        for (Data data:list
             ) {
            System.out.println(data.getNode1());
        }
        boolean flag[] = new boolean[n];

        return new int[0];
    }
//    public int dfs_min(int n, int[] A, int[] B, int[] C, int m, int s, int t){
//
//    }
    public static void main(String[] args) {
        test_9 test = new test_9();
//        test.getMin()
    }
}
