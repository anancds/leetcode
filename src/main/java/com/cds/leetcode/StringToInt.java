package com.cds.leetcode;

/**
 * Created by cds on 1/10/16.
 */
public class StringToInt {

    public static int myAtoi(String str) {
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;

        int signNum = 0;

        int res = 0;

        for (int i = 0; i < str.length() && signNum < 2; i++) {
            char ch = str.charAt(i);

            if (ch == '+') {

                signNum ++;
                continue;
            }

            if (ch == '-') {
                signNum ++;
                isNegative = true;
                continue;
            }

            int val = ch -48;
            if (val > 9 || val < 0)
                break;


            if(!isNegative && res>(Integer.MAX_VALUE-val)/10)
                return Integer.MAX_VALUE;

            if(isNegative && ( res> (Integer.MAX_VALUE-val)/10))
                return Integer.MIN_VALUE;

            res = 10 * res + val;
        }

        if (isNegative) {
            return res * -1;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+1"));
    }
}
