package code;

import java.util.HashMap;
import java.util.Map;

public class title_990 {
    public boolean equationsPossible(String[] equations) {
        Map<Character, Map<Character,Boolean>> map = new HashMap<>();
        for (String equation : equations) {
            char s1 = equation.charAt(0);
            char s2 = equation.charAt(3);
            String s3 = equation.substring(1,3);
            map.putIfAbsent(s1,new HashMap<>());
            map.putIfAbsent(s2,new HashMap<>());
            boolean flag = s3.equals("==") ? true : false;
            Map<Character,Boolean> map1 = map.get(s1);
            Map<Character,Boolean> map2 = map.get(s2);
            if(map1.containsKey(s2) || map2.containsKey(s1)){
                if(map1.get(s2) != flag || map2.get(s1) != flag)return false;
                continue;
            }
            map1.put(s2,flag);
            map2.put(s1,flag);
        }
        return true;
    }

//    public boolean dfs(char s, Map<Character, Map<Character,Boolean>> map){
//
//    }

    public static void main(String[] args) {
        String[] equations = new String[]{"a==b","b!=a"};
        title_990 title_990 = new title_990();
        title_990.equationsPossible(equations);
    }
}
