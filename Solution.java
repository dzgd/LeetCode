package com.qf.day01;

import java.util.Stack;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-2:48
 * @description：有效的括号
 * @version: 1.0
 */



public class Solution {

    public static void main(String[] args) {
        String s = "{[(({([])}))]}";
        boolean flag = isValid(s);
        System.out.println(flag);

    }



    public static boolean isValid(String s){
        if (s.length() == 0){
            return true;
        }


        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if (stack.isEmpty()){
                    return false;
                }else{
                    char temp = stack.pop();
                    if (ch == ')'){
                        if (temp != '('){
                            return false;
                        }
                    }else if (ch == ']'){
                        if (temp != '['){
                            return false;
                        }
                    }else if (ch == '}'){
                        if (temp != '{'){
                            return false;
                        }
                    }
                }

            }
        }

        return stack.isEmpty()? true : false;
    }

}
