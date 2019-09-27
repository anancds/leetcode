package com.cds.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cds on 24/7/16.
 */
public class HappyNumber {

    private static List list = new ArrayList<Integer>();
    public static boolean isHappy(int n) {


        int num = n;

        while (num != 1 ) {

            if (list.contains(num)) {
                return false;
            } else {
                list.add(num);
            }


            int sum = 0;
            while (num != 0)
            {
                int a = num%10;
                sum += Math.pow(a, 2);
                num /= 10;
            }
            num = sum;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isHappy(7));

    }
}
