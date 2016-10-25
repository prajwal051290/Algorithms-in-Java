// Logic:
/*
 * 1. Apply DFS
 * 2. Find left and right height
 * 3. if(leftHeight == 0 || rightHeight ==0)
            return leftHeight + rightHeight + 1;
        else
            return (Math.min(leftHeight, rightHeight) + 1);
   4. Step 3 is because - if any side of the subtree is empty i.e. null then its min depth will be determined by the 
   	  other side.
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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        if(leftHeight == 0 || rightHeight ==0)
            return leftHeight + rightHeight + 1;
        else
            return (Math.min(leftHeight, rightHeight) + 1);
    }
}