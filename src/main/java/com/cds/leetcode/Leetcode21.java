package com.cds.leetcode;

/**
 * Created by cds on 2019-09-25 22:57.
 */
public class Leetcode21 {

  class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
      this.val = val;

    }
  }
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    ListNode node = new ListNode(-1);
    ListNode cur = node;

    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
          node.next = l1;
          l1 = l1.next;
          node = node.next;
        } else {
          node.next = l2;
          l2 = l2.next;
          node = node.next;
        }
    }

    if (l1 != null) {
      node.next = l1;
    }

    if (l2 != null) {
      node.next = l2;
    }
    return cur.next;
  }

}
