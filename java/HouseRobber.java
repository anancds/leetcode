package com.cds.leetcode;

/**
 * Created by cds on 24/7/16.
 */
public class HouseRobber {
    private static int rot(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        } else if (size == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            return Math.max(nums[0], nums[1]);
        }
    }

    public static void main(String[] args) {

    }
}
