package code;

public class baidu_review {
//import java.util.*;
//    public class Main{
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int t1=0,t2=0;
//            HashMap<Integer,Integer> hs = new HashMap<>();
//            int[] a = new int[n+m];
//            int[] b = new int[m];
//            for(int i=0;i<n;i++){
//                t1 = sc.nextInt();
//                t2 = sc.nextInt();
//                a[i] = t1;
//                hs.put(t1,t2);
//            }
//            for(int i=0;i<m;i++){
//                t1 = sc.nextInt();
//                a[n+i] = t1;
//                b[i] = t1;
//                if(!hs.containsKey(t1))
//                    hs.put(t1,0);
//            }
//            Arrays.sort(a);
//            int max = 0;
//            for(int i=0;i<m+n;i++){
//                max = Math.max(max,hs.get(a[i]));
//                hs.put(a[i],max);
//            }
//            for(int i=0;i<m;i++){
//                System.out.println(hs.get(b[i]));
//            }
//        }
//    }
//
//import java.util.*;
//    public class Main{
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int h=0,m=0;
//            int[] a = new int[n];
//            for(int i=0;i<n;i++){
//                h = sc.nextInt();
//                m = sc.nextInt();
//                a[i] = h*60+m;
//            }
//            int t = sc.nextInt();
//            h = sc.nextInt();
//            m = sc.nextInt();
//            int p = h*60+m-t;
//            Arrays.sort(a);
//            t = Arrays.binarySearch(a,p);
//            if(t <0) t = -(t+2);
//            h = a[t]/60;
//            m = a[t]%60;
//            System.out.print(h+" "+m);
//        }
//    }
}
