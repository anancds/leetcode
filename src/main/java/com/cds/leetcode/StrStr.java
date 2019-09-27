package com.cds.leetcode;

/**
 * Created by cds on 1/10/16.
 */
public class StrStr {

    public static int strStr(String haystack, String needle) {
        int sourceLen = haystack.length();
        int endLen = needle.length();

        int index = -1;

        if (sourceLen < endLen) {
            return -1;
        }

        if (sourceLen == 0 || endLen == 0) {
            return 0;
        }

        for (int i = 0; i < sourceLen - endLen + 1; i++) {

            for (int j = 0; j < endLen; j++) {
               if (haystack.charAt(i + j) == needle.charAt(j)) {
                   if (j == endLen -1) {
                       index = i;
                       return index;
                   }

               } else {
                   index = -1;
                   break;
               }
            }
        }
        return index;
    }
}
