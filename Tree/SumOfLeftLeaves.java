/*
 * Find the sum of all left leaves in a given binary tree.
 * 
 */

/*
 * Logic:
 * 1. keep track of recursion side i.e. left or right
 * if lft side then return that node's value else return 0.
 * keep adding left and right up the tree
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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root,false);
    }
    private int sumOfLeftLeaves(TreeNode root, boolean leftSide) {
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(leftSide) return root.val;
            else return 0;
        }
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
}