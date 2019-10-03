package com.cds.leetcode.priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by cds on 2019-10-03 10:28.
 */
public class Leetcode215 {

  public int findKthLargest1(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k + 1];
  }

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(k);
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      if (queue.size() < k) {
        queue.offer(nums[i]);
      } else {
        if (queue.peek() < nums[i]) {
          queue.poll();
          queue.offer(nums[i]);
        }
      }

    }
    return queue.peek();
  }


}
