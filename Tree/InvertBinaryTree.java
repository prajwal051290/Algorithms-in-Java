/*Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

To:
	
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1*/

// Logic: invert left subtree & right subtree. Then attach these 2 subtrees to the parent node in 
// inverted way. Do this recursively on left and right. While going through recursion, maintian
// root.right in temp because it gets overriden in the process of inverting. So, while going up the
// recursion, it is important to maintain the original right of parent.

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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}