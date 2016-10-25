// Logic:
/*
 * 1. Apply DFS.
 * 2. Find left and right height
 * 3. return (max of left & right) + 1
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return (Math.max(leftHeight,rightHeight) + 1);
    }
}