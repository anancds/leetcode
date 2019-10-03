package com.cds.leetcode.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by cds on 2019-10-02 00:06.
 */
public class Leetcode1046 {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int stone : stones) {
      queue.offer(stone);
    }

    while (queue.size() > 1) {
      int a = queue.poll();
      int b = queue.poll();
      if ( a != b ) {
        queue.offer(b -a);
      }
    }

    if (queue.size() == 0 ) {
      return 0;
    }

    return queue.peek();

  }

}
