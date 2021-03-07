package test;

public class test_2 {
    public String[] multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        String a[] = new String[len2];
        for(int i = 0;i < len2;i++){
            a[i] = multiply_1(num1,num2.charAt(i)-'0',len2-i-1);
        }
        String s = new String();
        return a;
    }
    private String multiply_1(String num1,int ch,int index){
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = num1.length()-1;i >= 0;i--){
            int a = num1.charAt(i) - '0';
            int temp = a * ch + flag;
            sb.append(temp%10);
            flag = temp / 10;
        }
        if(flag != 0)sb.append(flag);
        sb = sb.reverse();
        for(int j = 0;j < index;j++){
            sb.append(0);
        }
        return sb.toString();
    }
    private String plus(String s1,String s2){
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for(int i = s1.length()-1,j = s2.length()-1;i>=0 || j>=0 || flag != 0;i--,j--){
            int x = i < 0 ? 0 : s1.charAt(i) - '0';
            int y = j < 0 ? 0 : s2.charAt(j) - '0';
            int sum = (x + y + flag) % 10;
            sb.append(sum);
            flag = (x + y + flag) / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        test_2 test_2 = new test_2();
        String[] res = test_2.multiply("9","9");
        for(int i = 0;i < res.length;i++){
            System.out.println(res[i]);
        }
//        System.out.println(test_2.plus("49200","6888"));
    }
}
