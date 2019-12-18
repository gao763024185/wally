package com.spb.wally.leetcode.array;

import javax.validation.constraints.Max;

/**
 * @description 力扣数组题库练习
 * @author: gaobh
 * @date: 2019/12/5 10:41
 * @version: v1.0
 */
public class LeetCodeArrayMain {


    public static void main(String[] args) {
        //移动零
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        moveZeroes(nums);
//        for (int num : nums) {
//            System.out.println(num);
//        }
//        //移除元素
//        int n = removeElement(nums, 5);
//        for (int i = 0; i < n; i++) {
//            System.out.println(nums[i]);
//        }
        //删除排序数组的重复项
//        int n = removeDuplicates(nums);
//        for (int i = 0; i < n; i++) {
//            System.out.println(nums[i]);
//        }
        //种花问题
//        int[] flowerbed = {1, 0, 0, 0, 1};
//        System.out.println(canPlaceFlowers(flowerbed, 1));
//        for (int i = 0; i < flowerbed.length; i++) {
//            System.out.println(flowerbed[i]);
//        }
        System.out.println(maxSubArray(nums));

    }

    /**
     * 53.最大子序和
     * 动态规划
     * @param nums
     * @return
     */
    public static int maxSubArray1(int[] nums) {
       int[] dp = new int[nums.length];
       dp[0]=nums[0];
       int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            res = Math.max(dp[i],res);
        }
        return res;
    }
    /**
     * 53.最大子序和
     * 动态规划
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum>0){
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            result = Math.max(result,sum);

        }
        return result;
    }

    /**
     * 移动零
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int p = 0;
        for (int q = 0; q < nums.length; q++) {
            if (nums[q] != 0) {
                if (nums[p] != nums[q]) {
                    nums[p] = nums[q];
                    nums[q] = 0;
                }
                p++;
            }
        }
    }


    /**
     * 移除元素
     *
     * @param nums
     */
    public static int removeElement(int[] nums, int val) {
        int p = 0;
        for (int q = 0; q < nums.length; q++) {
            if (nums[q] != val) {
                nums[p] = nums[q];
                p++;
            }
        }
        return p;
    }

    /**
     * 删除排序数组的重复项
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
        }
        return p + 1;
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int p = 0;
        for (int q = 0; q < nums.length; q++) {

        }
        return nums;
    }


    /**
     * 种花问题
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length && count < n; i++) {
            if (flowerbed[i] == 0) {
                int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                int pre = i == 0 ? 0 : flowerbed[i - 1];
                if (next == 0 && pre == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }

    /**
     * 种花问题
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int count = 1;
        int result = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else {
                result += (count - 1) / 2;
                count = 0;
            }
        }
        if (count != 0) {
            result += count / 2;
        }
        return result >= n;

    }

    /**
     * 种花问题
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i - 1 == -1 || flowerbed[i - 1] == 0)
                    && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <= 0;

    }
}
