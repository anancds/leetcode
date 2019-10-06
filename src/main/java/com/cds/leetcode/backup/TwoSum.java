package com.cds.leetcode.backup;

/**
 * Created by cds on 22/7/16.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] reulst = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < target && nums[i] + nums[j] == target){
                    reulst[0] = i;
                    reulst[1] = j;
                }
            }

        }
        return reulst;
    }

    public static void main(String[] args) {

        int[] test = {0,4,3,0};
        System.out.println(twoSum(test, 0).toString());
    }
}
