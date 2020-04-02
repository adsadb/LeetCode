package code;

public class title_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() == 0 || text2.length() == 0 || text1 == null || text2 == null)return 0;
        int len1 = text1.length();
        int len2 = text2.length();
        int dp[][] = new int[len1+1][len2+1];
        for(int i = 0;i < len1;i++){
            for (int j = 0;j < len2;j++){
                char c1 = text1.charAt(i), c2 = text2.charAt(j);
                if(c1 == c2){
                    dp[i+1][j+1] = dp[i][j] + 1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[len1][len2];
    }
    public static void main(String[] args){
        title_1143 title_1143 = new title_1143();
        String text1 = "bcbade";
        String text2 = "acbe";
        System.out.println(title_1143.longestCommonSubsequence(text1,text2));
    }
}
