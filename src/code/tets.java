package code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class tets {
//    public class Singleton{
//        private volatile Singleton singleton;
//        private Singleton(){}
//
//        public Singleton getSingleton(){
//            if(singleton == null){
//                synchronized (Singleton.class){
//                    if(singleton == null){
//                        return new Singleton();
//                    }
//                }
//            }
//            return singleton;
//        }
//    }

    public class Singleton{
        private volatile Singleton singleton;
        public Singleton(){}

        public Singleton getSingleton(){
            if(singleton == null){
                synchronized (Singleton.class){
                    if(singleton == null){
                        return new Singleton();
                    }
                }
            }
            return singleton;
        }
    }


    public static void main(String[] args) {
        
    }
}
