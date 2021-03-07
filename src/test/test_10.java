package test;

import code.title_25;

import java.util.List;
import java.util.Stack;

public class test_10 {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        if(s == null || s.length() == 0) {
//            return true;
//        }
//        stack.push(s.charAt(0));
//        for(int i = 1;i < s.length();i++){
//            boolean flag = false;
////            switch (s.charAt(i)){
////                case '(':
////                    if(stack.peek() == ')') {
////                        stack.pop();
////                        flag = true;
////                    };
////                case '{':
////                    if(stack.peek() == '}') {
////                        stack.pop();
////                        flag = true;
////                    };
////                case '[':
////                    if(stack.peek() == ']') {
////                        stack.pop();
////                        flag = true;
////                    }
////            }
//
//            if(s.charAt(i) == '('){
//                if(stack.peek() == ')') {
//                    stack.pop();
//                }
//            }else if(s.charAt(i) == '{'){
//                if(stack.peek() == '}') {
//                    stack.pop();
//                }
//            }else if(s.charAt(i) == '['){
//                if(stack.peek() == ']') {
//                    stack.pop();
//                }
//            }
//            if (!flag)
//            {
//                stack.push(s.charAt(i));
//            }
//        }
//        return stack.isEmpty();
//    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s == null || s.length() == 0) {
            return true;
        }
        for(char ch : s.toCharArray()){
            if(ch == '(') {
                stack.push(')');
            } else if(ch == '{') {
                stack.push('}');
            } else if(ch == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || ch != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getMidNode(ListNode list){
        if(list == null || list.next == null)return new ListNode(-1);
        ListNode fast = list.next;
        ListNode slow = list;
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public int test(int num){
        int res = 0;
        if(num == 0 || num / 10 == 0){
            return num;
        }
        while(num > 0){
            int a = num % 10;
            res = res * 10 + a;
            num /= 10;
        }
        return num;
    }




    public static void main(String[] args) {
        test_10 test = new test_10();
        System.out.println(test.isValid("()"));
    }
}
