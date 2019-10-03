package com.cds.leetcode.HashMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by cds on 2019-10-03 10:50.
 */
public class Leetcode347 {


  public List<Integer> topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    List<Integer>[] bucket = new List[nums.length + 1];
    for (int key : map.keySet()) {
      int frequency = map.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> res = new ArrayList<>();

    for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
      if (bucket[pos] != null) {
        res.addAll(bucket[pos]);
      }
    }
    return res;

  }

  public static void main(String[] args) {
    int[] inputs = {4,1,-1,2,-1,2,3, 2};
    new Leetcode347().topKFrequent(inputs, 2);
  }
}
