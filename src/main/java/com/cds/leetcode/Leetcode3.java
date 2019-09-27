package com.cds.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cds on 2019-09-22 16:18.
 */
public class Leetcode3 {

  public static int lengthOfLongestSubstring(String s) {
    if (s.length() ==0) {
      return 0;
    }

    if (s.length() == 1) {
      return 1;
    }

    Map<Character, Integer> windows = new HashMap<>();
    int count = 1;
    int subLen = Integer.MIN_VALUE;
    int left =0;
    for (int i = 0; i < s.length(); i++) {
      windows.put(s.charAt(i), windows.getOrDefault(s.charAt(i), 0) + 1);

      if (windows.get(s.charAt(i)) > 1) {
        count = 2;
      }


      int temp = count;
      while (count == 2) {
        if (windows.size() > subLen) {
          subLen = windows.size();
        }

        if (windows.get(s.charAt(left)) == 1) {
          windows.remove(s.charAt(left));
        } else {
          windows.put(s.charAt(left), 1);
          count--;
        }
        left++;

      }

    }

    if (windows.size() > subLen) {
      subLen = windows.size();
    }

    return subLen == Integer.MIN_VALUE ? s.length(): subLen;
  }

  public static void main(String[] args) {
//    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("aab"));

  }

}
