package com.cds.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by cds on 2019-10-03 13:00.
 */
public class Leetcode973 {

  public int[][] kClosest(int[][] points, int K) {
    Arrays.sort(points, Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
    return Arrays.copyOfRange(points, 0, K);
  }

}
