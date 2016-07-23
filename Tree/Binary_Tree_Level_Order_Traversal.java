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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<List<Integer>>();
        if (root == null)
            return levelOrderList;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentList = new ArrayList<Integer>();
            for (int i = 0; i < size ; i++){
                TreeNode temp = queue.remove();
                currentList.add(temp.val);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            levelOrderList.add(currentList);
        }
        return levelOrderList;
    }
}