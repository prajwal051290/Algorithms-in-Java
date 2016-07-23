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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preorderList = new ArrayList<Integer>();
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        while(root != null || !treeNodes.empty()){
            if(root != null){
                preorderList.add(root.val);
                treeNodes.push(root);
                root = root.left;
            }
            if(root==null){
                TreeNode temp = treeNodes.pop();
                root = temp.right;
            }
        }
        return preorderList;
    }
}