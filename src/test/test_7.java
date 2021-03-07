package test;

public class test_7 {
    public boolean validPalindrome(String s) {
        return helper(s,false);
    }
    public boolean helper(String s,boolean flag){
        int len = s.length();
        int low = 0,high = len-1;
        while(low < high){
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
                continue;
            }else{
                if(!flag)return helper(s.substring(low,high),true) || helper(s.substring(low+1,high+1),true);
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        test_7 test = new test_7();
        System.out.println(test.validPalindrome("abcadqsdaacba"));
    }
}
