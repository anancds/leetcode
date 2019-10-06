package com.cds.leetcode.backup;

/**
 * Created by cds on 1/10/16.
 */
public class ReverseList {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
//        ListNode tmp = new ListNode(0);
//        ListNode current = new ListNode(0);
//        tmp.next = head;
//
//        while (head != null && head.next!= null) {
//           current.next = head.next;
//
//            head.next = current.next.next;
//
//            current.next.next = tmp.next;
//
//            tmp.next = current.next;
//
//        }
//
//        return tmp.next;


        ListNode tmp = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = tmp;
            tmp = head;
            head = next;
        }

        return tmp;
    }
}
