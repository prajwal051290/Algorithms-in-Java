/*Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.*/

// Logic: check height of left and right subtrees recursively and if difference is greater than 1 then return false.
// Use helper function here

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
    public boolean isBalanced(TreeNode root) { 
        if(isBalancedHeight(root)==-1)
            return false;
        else
            return true;
    }
    private int isBalancedHeight(TreeNode root){
        
        if(root==null)
            return 0;
            
        int leftHeight = isBalancedHeight(root.left);
        int rightHeight = isBalancedHeight(root.right);
        
        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight-rightHeight)>1)
            return -1;
            
        return Math.max(leftHeight,rightHeight) + 1;
        
    }
}