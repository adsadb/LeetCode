package test;

import java.util.ArrayList;
import java.util.List;

public class test_3 {
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> list = new ArrayList<>();
        dfs(s,list,"",0);
        return list;
    }
    private void dfs(String s,List<String> list,String temp,int count){
        if(count>3)return;
            if(s.length() <= 3 && count == 3){
                temp += s;
                list.add(temp);
            }

        if(s.length() > 3 && Integer.parseInt(s.substring(0,3)) <= 255) {
            dfs(s.substring(3, s.length()), list, temp + s.substring(0, 3) + ".", count + 1);
        }
        if(s.length() > 2){
            dfs(s.substring(2,s.length()),list,temp+s.substring(0,2)+".",count+1);
        }
        if(s.length() > 1) {
            dfs(s.substring(1, s.length()), list, temp + s.substring(0, 1) + ".", count + 1);
        }
    }

    public static void main(String[] args) {
        test_3 test_3 = new test_3();
        System.out.println(test_3.restoreIpAddresses(""));
    }
}
