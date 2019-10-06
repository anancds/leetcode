package com.cds.leetcode.slidingwindow;

/**
 * Created by cds on 2019-10-06 12:36.
 */
public class Leetcode1004 {

  public int longestOnes(int[] A, int K) {
    int length = A.length;
    int zeros = 0;
    int start = 0;
    int maxLength = 0;

    for (int end = 0; end < length; end++) {

      if (A[end] == 0) {
        zeros++;
        while (zeros > K) {
          if (A[start] == 0) {
            zeros--;
          }
          start++;
        }
      }

      maxLength = Math.max(maxLength, end - start + 1);
    }
    return maxLength;
  }

}
