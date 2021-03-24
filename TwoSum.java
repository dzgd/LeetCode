package com.qf.day01;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author     ：青崖log一白鹿
 * @date       ：Created in 2021/3/22-03-22-23:54
 * @description：两数之和
 * @version:     1.0
 */public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,5,7,8,4,6,12,75};
        System.out.println(Arrays.toString(nums));
        int[] result1 = twoSum(nums,82);
        System.out.println(Arrays.toString(result1));
        int[] result2 = twoSumWay(nums,82);
        System.out.println(Arrays.toString(result2));

    }


     //暴力解法
     public static int[] twoSum(int[] nums,int target){
         int[] result = new int[2];
         for (int i = 0; i < nums.length; i++) {
             for (int j = i+1; j < nums.length; j++) {
                 int sum = nums[i] +nums[j];
                 if (sum==target){
                     result[0] = i;
                     result[1] = j;
                     return result;
                 }
             }
         }
         return result;
     }


     //哈希表法
    public static int[] twoSumWay(int[] nums,int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] , i);
        }
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if (map.containsKey(diff) && map.get(diff)!=j){
                result[0] = j;
                result[1] = map.get(diff);
                return result;
            }
        }
        return result;
    }

}




