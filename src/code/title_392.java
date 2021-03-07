package code;

public class title_392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        int lenS = s.length() - 1;
        int i = 0;
        int lenT = t.length() - 1;
        int j = 0;
        while(i <= lenS && j <= lenT){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(i > lenS ? true : false);
    }
}
