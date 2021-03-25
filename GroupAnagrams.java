package com.qf.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/25-03-25-17:29
 * @description：字母异位词分组
 * @version: 1.0
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"cat","tac","atc","cta","anywhere","aynwereh","rehwanye","fish","didh","ddhi"};
        List<String> res1 = groupAnagrams(strs);
        List<List<String>> res2 = groupAnagramsTwo(strs);
        System.out.println(res1);
        System.out.println(res2);


    }

    //排序法
    public static List<String> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> result = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }


    //哈希表法
    public static List<List<String>> groupAnagramsTwo(String[] strs){
        HashMap<String, ArrayList<String>> result = new HashMap<>();
        for (String s : strs){
            int[] count_table = new int[26];
            for (char c : s.toCharArray()){
                count_table[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int count : count_table){
                sb.append('#');
                sb.append(count);
            }
            String key = sb.toString();
            if(!result.containsKey(key)){
                result.put(key,new ArrayList());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());

    }

}

