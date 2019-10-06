package com.cds.leetcode.backup;

/**
 * Created by cds on 2/10/16.
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return climbStairs(n -1) + climbStairs(n -2);
    }

    public static int climbStairs1(int n) {
       int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i -1] + res[i -2];
        }

        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
