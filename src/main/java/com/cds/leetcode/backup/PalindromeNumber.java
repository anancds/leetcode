package com.cds.leetcode.backup;

/**
 * Created by cds on 1/10/16.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (s.length() < 2) {
            return true;
        }
        boolean res = false;
        for (int i = 0; i < s.length() / 2; i++) {
           if (s.charAt(i) == s.charAt(s.length() -1 -i)) {
               res = true;
           } else {
               res = false;
               break;
           }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(222));

    }
}
