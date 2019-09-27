package com.cds.leetcode;

/**
 * Created by cds on 2019-09-25 23:09.
 *
 * dp[n] = if
 */
public class Leetcode53 {
  public int maxSubArray(int[] nums) {
    if (nums == null) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }

    int n = nums.length;

    int dp[] = new int[n];
    dp[0] = nums[0];
    int max = Integer.MIN_VALUE;

    for (int i = 1; i < n; i++) {

      if (dp[i -1] > 0) {
        dp[i] = dp[i -1] + nums[i];
      } else {
      }
    }

    for (int i = 0; i < n; i++) {
      max = Math.max(max, dp[i]);
    }


    return max;
  }

  public static void main(String[] args) {

  }

}
