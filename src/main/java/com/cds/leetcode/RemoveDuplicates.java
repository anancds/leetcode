package com.cds.leetcode;

/**
 * Created by cds on 2/10/16.
 */
public class RemoveDuplicates {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.next.val == temp.val) {
               temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}

