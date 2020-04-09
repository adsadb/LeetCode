package code;

public class title_10_isMatch {
    public boolean isMatch(String s, String p) {
        int lenS = s.length(), lenP = p.length();
        boolean dp[][] = new boolean[lenS+1][lenP+1];
        //将[0][0]位置初始化为0，代表两个空字符串可以匹配
        dp[0][0] = true;
        //初始化第一行，把‘*’的位置做一个为空的处理，不然‘aa’与‘a*’就无法匹配
        for(int i = 2;i <= lenP;i++){
            if(p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-2];
            }
        }
        /*分为三种
        1.S == P || P == '.'：dp[i-1][j-1]传递给dp[i][j]
        2.P == '*' && dp[i][j-2]：‘*’匹配为0的情况
        3.P == '*' && 其他：‘*’为1或多，只需将dp[i-1][j]传递至dp[i][j]
        */
        for(int i = 1;i <= lenS;i++){
            for(int j = 1;j <= lenP;j++){
                char S = s.charAt(i-1), P = p.charAt(j-1);
                if(S == P || P == '.')dp[i][j] = dp[i-1][j-1];
                else if(P == '*'){
                    if(dp[i][j-2])dp[i][j] = true;
                    else if(S == p.charAt(j-2) || p.charAt(j-2) == '.'){
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[lenS][lenP];
    }
}
