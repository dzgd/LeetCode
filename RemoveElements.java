package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/25-03-25-16:18
 * @description：移除元素
 * @version: 1.0
 */
public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {0,12,4,5,7,5,30,0,5,7,5,9,5};
        int val = 5;
        int i = removeElement(nums, val);
        System.out.println(i);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
            }

    }


    //双指针方法
    public static int removeElement(int[] nums , int val){
        if (nums == null || nums.length ==0){
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l<r){
            while (l<r && nums[l] != val){
                l++;
            }
            while (l<r && nums[r] == val){
                r--;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums[l] == val? l:l+1;
    }


}
