package com.cds.leetcode.backup;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cds on 2019-09-21 00:40.
 */
public class Leetcode76 {

  public static String minWindow(String s, String t) {

    Map<Character, Integer> needs = new HashMap<>();
    Map<Character, Integer> windows = new HashMap<>();

    for (int j = 0; j < t.length(); j++) {
      needs.put(t.charAt(j), needs.getOrDefault(t.charAt(j), 0) + 1);
    }

    int left = 0;
    int match = 0;
    String res = "";
    int minLen = Integer.MAX_VALUE;
    for (int i = 0; i < s.length(); i++) {

      if (needs.containsKey(s.charAt(i))) {
        windows.put(s.charAt(i), windows.getOrDefault(s.charAt(i), 0) + 1);
        if (windows.getOrDefault(s.charAt(i), 0).equals(needs.get(s.charAt(i)))) {
          match++;
        }
      }

      while (match == needs.size()) {

        if ((i - left + 1) < minLen) {
          minLen = i - left + 1;
          res = s.substring(left, i + 1);
        }

        if (windows.containsKey(s.charAt(left))) {
          windows.put(s.charAt(left), windows.get(s.charAt(left)) - 1);
          if (windows.get(s.charAt(left)) < needs.get(s.charAt(left))) {
            match--;
          }
        }
        left++;

      }

    }

    return minLen == Integer.MAX_VALUE ? "" : res;
  }

  public static void main(String[] args) {

    System.out.println(minWindow("ADOBECODEBANC", "ABC"));
  }
}
