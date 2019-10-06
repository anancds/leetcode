package com.cds.leetcode.backup;

/**
 * Created by cds on 22/7/16.
 */
public class SumOfTwoInteger {

    static int bitAdd(int a,int b)
    {
        if(b==0)
            return a;
        int sum = a^b;
        int carry =(a&b)<<1;
        return bitAdd(sum,carry);
    }

    public static void main(String[] args) {
        System.out.println(bitAdd(300, 4));
    }
}
