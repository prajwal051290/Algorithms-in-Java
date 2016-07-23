/*Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrderBottomList = new ArrayList<List<Integer>>();
        if (root == null)
            return levelOrderBottomList;
        Stack<List<Integer>> levelStack = new Stack<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevelList = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.remove();
                currentLevelList.add(temp.val);
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
            levelStack.push(currentLevelList);
        }
        while(!levelStack.empty()){
            levelOrderBottomList.add(levelStack.pop());
        }
        return levelOrderBottomList;
    }
}