// Logic: MAx(height of left subtree, height of right subtree) + 1
// When recursion reaches null, it returns 0 from left an both sides. 1 is added for that current node.
// Then these values are passed up the stack and ultimately to calling function.

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
    public int countNodes(TreeNode root) {
        
        if (root == null)
            return 0;
            
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        
        return Math.max(left,right) + 1;
        
    }
}