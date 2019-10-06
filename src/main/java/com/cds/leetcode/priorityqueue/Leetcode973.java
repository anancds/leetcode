package com.cds.leetcode.priorityqueue;

import java.util.PriorityQueue;

/**
 * Created by cds on 2019-10-03 12:37.
 */
public class Leetcode973 {

  public int[][] kClosest(int[][] points, int K) {

    int[][] res = new int[K][2];

    PriorityQueue<int[]> maxHeap =
        new PriorityQueue<>((a,b)->((b[1] * b[1] + b[0] * b[0])  - (a[1] * a[1] + a[0] * a[0])));
    for(int[] temp : points){
      maxHeap.add(temp);
      if (maxHeap.size() > K) {
        maxHeap.poll();
      }
    }

    while (K > 0) {
      res[--K] = maxHeap.poll();
    }

    return res;
  }

}
