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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
            
        Stack<TreeNode> stack1 = new Stack<TreeNode>();    
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);
        
        while(!stack1.empty()){
            root = stack1.pop();
            stack2.push(root);
            if(root.left!=null)
                stack1.push(root.left);
            if(root.right!=null)
                stack1.push(root.right);
        }
        
        while(!stack2.empty()){
            result.add(stack2.pop().val);
        }
        return result;
    }
}