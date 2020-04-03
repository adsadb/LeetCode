package code;

public class title_8_myAtoi {
    public int myAtoi(String str) {
        int len = str.length();
        char s[] = str.toCharArray();
        boolean flag = false;//positive
        int index = 0;
        while(index < len && s[index] == ' '){
            index++;
        }
        if(index == len)return 0;
        if(s[index] == '-'){
            flag = true;//negative
            index++;
        }
        else if(s[index] == '+')index++;
        else if(!Character.isDigit(s[index]))return 0;
        int ans = 0;
        while(index < len && Character.isDigit(s[index])){
            int digit = s[index++] - '0';
            if(ans > (Integer.MAX_VALUE - digit) / 10)return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            ans = ans * 10 + digit;
        }
        return flag?-ans:ans;
    }
}
