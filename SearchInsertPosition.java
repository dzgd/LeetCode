package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/25-03-25-16:51
 * @description：搜索插入位置
 * @version: 1.0
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,7,12,15,16,18,21,34,35};
        int target = 17;
        int i = searchInsert(nums, target);
        System.out.println(i);
        int j = searchInsertTwo(nums, target);
        System.out.println(j);


    }

    //常规方法
    public static int searchInsert(int[] nums , int target){
        if (nums == null || nums.length ==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }



    //二分查找法
    public static int searchInsertTwo(int[] nums , int target){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return nums[left] < target? left+1:left;
    }
}
