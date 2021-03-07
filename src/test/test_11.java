package test;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
public class test_11 {
    static class Data{
        private int weight;
        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Data(int weight) {
            this.weight = weight;
        }
    }
    List<Data> list = new LinkedList<>();

    public static void main(String[] args) {
        test_11 test = new test_11();
        for (int i = 0 ;i < 10;i++){
            Data data = new Data(1);
            test.list.add(data);
        }
        Data data = test.list.get(0);
        System.out.println(data.getWeight());
    }
}
