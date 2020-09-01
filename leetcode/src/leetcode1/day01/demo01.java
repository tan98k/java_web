package leetcode1.day01;

import java.util.Stack;

public class demo01 {
    public static void main(String[] args) {
        System.out.println(isValid("()()[][]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            if(s.charAt(i) == '{'){
                stack.push('{');
            }
            if(s.charAt(i) == '['){
                stack.push('[');
            }
            if (s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.pop() == '(')
                    continue;
                else
                    return false;
            }
            if (s.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.pop() == '{')
                    continue;
                else
                    return false;
            }
            if (s.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.pop() == '[')
                    continue;
                else
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
