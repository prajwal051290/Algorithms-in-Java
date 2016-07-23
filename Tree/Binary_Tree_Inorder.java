/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorderList = new ArrayList<Integer>();
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        while (root != null || !treeNodes.empty()){
            if (root == null){
                TreeNode temp = treeNodes.pop();
                inorderList.add(temp.val);
                root = temp.right;
            }
            if (root != null){
                treeNodes.push(root);
                root = root.left;
            }
        }
        return inorderList;
    }
}