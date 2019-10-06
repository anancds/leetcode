package com.cds.leetcode.backup;

/**
 * Created by cds on 4/10/16.
 */
public class BalancedBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isBalanced(TreeNode root) {

        if (getHeight(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = getHeight(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
