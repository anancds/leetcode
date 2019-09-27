package com.cds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cds on 2019-09-22 17:02.
 */
public class Leetcode282 {

  public static List<String> operator = Arrays.asList("+", "-", "*");

  public static void dfs(int level, int target, String num, int result) {
    if (result == target || level > num.length()) {
      return;
    }

    for (int i = 0; i < operator.size(); i++) {

    }
  }



  public static List<String> addOperators(String num, int target) {


    List<String> list = new ArrayList<>();

    dfs(0, target, num, 0);

    return list;
  }

  public static void main(String[] args) {

  }

}
