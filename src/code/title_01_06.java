package code;
//StringBuilder 节省了String += 时重建对象的时间（111ms-15ms）
//适当控制for循环中的if语句
//if语句中的|| 应考虑将判断多为true的放在前面
//         && 应考虑将判断多为false的放在前面
// 可以节约另一半的判断时间
//res.append(ch + "" + num) 这条语句最好将其拆分为两部分res.append(ch);res.append(num);
//  因为里面ch + "" + num这条语句会将其合并建立一个String类型，比较耗时 本例能节约7ms（11ms-4ms）
public class title_01_06 {
    public String compressString(String S) {
        int num = 0;
        int len = S.length();
        if(S == null || len == 0)return "";
        StringBuilder res = new StringBuilder(); //节约111ms-15ms
        char ch = S.charAt(0);
        for (int i = 0;i < len;i++){
            char ch_i = S.charAt(i);
            if(ch != ch_i){
                res.append(ch);
                res.append(num); //7ms（11ms-4ms）
                ch = ch_i;
                num = 1;
            }else{
                num++;
            }

        }
        res.append(ch);  //语句移出if后节约4ms(15ms - 11ms)
        res.append(num);
        return res.length() >= len ?S : res.toString();
    }
    public static void main(String [] args){
        title_01_06 title_01_06 = new title_01_06();
        String s = "abbccd";
        System.out.println(title_01_06.compressString(s));
    }
}
