package com.cds.leetcode;

/**
 * Created by cds on 4/10/16.
 */
public class MinimumDepth {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);

        int rightDepth = minDepth(root.right);

        if (leftDepth == 0 || rightDepth == 0) {
            return leftDepth + rightDepth + 1;
        } else {
            return Math.min(leftDepth, rightDepth) + 1;
        }

    }
}
