package code;
import java.util.*;
public class test {

//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            int C = sc.nextInt();
//            int d[] = {N,A,B,C};
//            int a[] = new int[N];
//            for(int i=0;i<N;i++){
//                int data = sc.nextInt();
//                a[i] = data;
//            }
//            int min = 0;
//            dfs(a,a[0],0,d);
//            System.out.println(Math.min(dfs(a,a[0],d[1],d),Math.min(dfs(a,a[0]-1,d[2],d),dfs(a,a[0]+1,d[3],d))));
//        }
//        public static int dfs(int a[], int i, int cost, int d[]){
//            if(a[i] == d[0])return cost+d[1];
//            if(i > 1 && i < d[0]){
//                return Math.min(dfs(a,a[i],cost+d[1],d),Math.min(dfs(a,a[i]-1,cost+d[2],d),dfs(a,a[i]+1,cost+d[3],d)));
//            }
//            return 0;
//        }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int matrix[][] = new int[m][n];
//        if(m == 0 || n == 0 || a == 0 || b == 0) System.out.print(0);
//        for(int i= 0;i<m;i++){
//            for(int j = 0;j<n;j++){
//                matrix[i][j] = i * j / 10;
//            }
//        }
//        int res = 0;
//        for(int i= 0;i<m;i++){
//            int max = -1;
//            if(i+a>m)break;
//            for(int j = 0;j<n;j++){
//                if(j+b>n)break;
//                for(int k = 0;k < a;k++){
//                    for(int l = 0;l<b;l++){
//                        if(matrix[i+k][j+l] == 9){
//                            max = 9;
//                            break;
//                        }
//                        max = Math.max(max,matrix[i+k][j+l]);
//                    }
//                }
//                res += max;
//                max = -1;
//            }
//        }
//        System.out.print(res);
//    }
//        public static void main(String args[]){
//            Scanner in = new Scanner(System.in);
//            while(in.hasNext()){
//                String s = in.nextLine();
//                int len = s.length();
//                int n = len % 8 == 0 ? len / 8:len / 8 + 1;
//                s += "000000000";
//                for(int i = 0;i < n;i++){
//                    System.out.println(s.substring(n*8,(n+1)*8));
//                }
//            }
//        }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        while(num > 0){
            int low = num % 10;
            num /= 10;
            if(set.contains(low)){
                continue;
            }
            set.add(low);
            res = res*10 + low;
        }
        System.out.println(res);
    }
}
