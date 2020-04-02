package code;

public class title_717 {
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            if(bits == null ||bits.length==0)return false;
            if(bits.length == 1)return true;
            int i = bits.length-1;
            int num = 0;
            while(i>0 && bits[--i] == 1){
                num++;
            }
            return num%2 == 0?true:false;
        }
    }
}
