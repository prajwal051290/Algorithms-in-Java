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
        int minimumDepth = 0;
        if (root == null)
            return minimumDepth;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean minimumDepthFound = false;
        while(!queue.isEmpty()){
            minimumDepth++;
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode temp = queue.remove();
                if (temp.left == null && temp.right == null){
                    minimumDepthFound = true;
                    break;
                }
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            if (minimumDepthFound == true)
                break;
        }
        return minimumDepth;
    }
}