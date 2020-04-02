package code;

public class title_1013 {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for(int i : A){
                sum += i;
            }
            if(sum % 3 != 0)return false;
            int len = A.length - 1;
            int j = 1;
            int k = len - 1;
            while(A[0] != sum/3){
                if(j == len)return false;
                A[0] += A[j++];
            }
            while(A[len] != sum/3){
                if(k == j)return false;
                A[len] += A[k--];
            }
            while(j < k){
                A[0] += A[j];
            }
            if(A[0] == sum / 3 *2) return true;
            return false;
        }
    }
}
