package com.cds.leetcode;

/**
 * Created by cds on 1/10/16.
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}
