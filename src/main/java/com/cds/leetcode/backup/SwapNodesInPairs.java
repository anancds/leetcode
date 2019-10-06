package com.cds.leetcode.backup;

/**
 * Created by cds on 1/10/16.
 */
public class SwapNodesInPairs {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode dummy = newHead;

        ListNode first = null;

        ListNode second = null;

        while (dummy.next != null && dummy.next.next != null) {
            first = dummy.next;
            second = dummy.next.next;

            first.next = second.next;
            second.next = first;
            dummy.next = second;
            dummy = first;
        }

        return dummy.next;
    }
}
