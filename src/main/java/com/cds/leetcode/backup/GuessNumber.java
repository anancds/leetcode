package com.cds.leetcode.backup;

/**
 * Created by cds on 22/7/16.
 */
public class GuessNumber {
    public static int guessNumber(int n) {
        int i = 0;
        int j = n;
        while (i < j) {
            int mid = i + (j - i) >>> 2;
            if (mid == 0) {
                return mid;
            }
            else if (mid == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}
