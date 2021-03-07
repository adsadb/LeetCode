package code;

import java.util.*;

public class title_399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries){
        //构建一个图，用List<String,HashMap<String,Double>>来代表
        Map<String, Map<String,Double>> map = new HashMap<>();
        int index = 0;
        for (List<String> equation : equations) {
            String s1 = equation.get(0);
            String s2 = equation.get(1);
            map.putIfAbsent(s1,new HashMap<>());
            map.putIfAbsent(s2,new HashMap<>());
            map.get(s1).put(s2,values[index]);
            map.get(s2).put(s1,1 / values[index]);
            index++;
        }
        double[] res = new double[queries.size()];
        Arrays.fill(res,-1.0);
        int index1 = 0;
        for (List<String> query : queries) {
            String s1 = query.get(0);
            String s2 = query.get(1);
            if(!map.containsKey(s1) || !map.containsKey(s2)){
                index1++;
                continue;
            }else{
                Set<String> visited = new HashSet<>();
                dfs(map,s1,s2,new HashSet<>(),res,index1,1.0);
                index1++;
            }
        }
        return res;
    }
    public void dfs(Map<String, Map<String,Double>> map, String s1, String s2, Set<String> visited, double[] res, int index, double temp){
        visited.add(s1);
        if(!map.containsKey(s1) || map.get(s1).size() == 0){
            return;
        }
        Map<String, Double> costMap = map.get(s1);
        if(costMap.containsKey(s2)){
            res[index] = temp * costMap.get(s2);
            return;
        }
        for (String next : costMap.keySet()) {
            if(visited.contains(next))continue;
            dfs(map,next,s2,visited,res,index,temp * costMap.get(next));
        }
    }
}
