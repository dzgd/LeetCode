package com.qf.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-17:40
 * @description：生成配对括号
 * @version: 7.0
 */
public class Genekuohao {
    public static void main(String[] args) {
        Genekuohao gk = new Genekuohao();
        List<String> res = gk.generateParenthesis(2);
        System.out.println(res);
    }



    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(n, result, 0, 0, "");
        return result;
    }

    private void backtracking(int n, List<String> result, int left, int right, String str) {
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }

        if (left < n) {
            backtracking(n, result, left+1, right, str+"(");
        }

        if (right < left) {
            backtracking(n, result, left, right+1, str+")");
        }
    }
}
