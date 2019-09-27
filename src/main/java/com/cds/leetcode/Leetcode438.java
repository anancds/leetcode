package com.cds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cds on 2019-09-22 15:55.
 */
public class Leetcode438 {

  public static List<Integer> findAnagrams(String s, String p) {


    List<Integer> list = new ArrayList<>();

    Map<Character, Integer> needs = new HashMap<>();
    Map<Character, Integer> windows = new HashMap<>();

    for (int j = 0; j < p.length(); j++) {
      needs.put(p.charAt(j), needs.getOrDefault(p.charAt(j), 0) + 1);
    }

    int left = 0;
    int match = 0;
    for (int i = 0; i < s.length(); i++) {

      if (needs.containsKey(s.charAt(i))) {
        windows.put(s.charAt(i), windows.getOrDefault(s.charAt(i), 0) + 1);
        if (windows.getOrDefault(s.charAt(i), 0).equals(needs.get(s.charAt(i)))) {
          match++;
        }
      }

      while (match == needs.size()) {


        if (i - left + 1 == p.length()) {
          list.add(left);
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

    return list;

  }

  public static void main(String[] args) {
    System.out.println(findAnagrams("cbaebabacd", "abc"));
  }


}
