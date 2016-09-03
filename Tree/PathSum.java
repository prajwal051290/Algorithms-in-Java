/*Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,

5
/ \
4   8
/   / \
11  13  4
/  \      \
7    2      1

return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.*/

// Logic: left and right recurssion. at leaf check if sum has reached. keep subtracting the sum from node's value
// while going down the tree.

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left==null && root.right==null){
            if(sum==root.val)
                return true;
            else
                return false;
        }
        boolean left = hasPathSum(root.left,sum-root.val);
        boolean right = hasPathSum(root.right,sum-root.val);
        
        return (left || right);
    }
}