/*Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZagList = new ArrayList<List<Integer>>();
        if(root == null)
            return zigZagList;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean forwardDirection = true;
        int levelNumNodes = 1;
        LinkedList<Integer> currList = new LinkedList<Integer>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            if(forwardDirection)
                currList.add(temp.val);
            else
                currList.addFirst(temp.val);
            
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
            
            levelNumNodes--;
            
            if(levelNumNodes == 0){
                levelNumNodes = queue.size();
                zigZagList.add(currList);
                if(levelNumNodes!=0)
                    currList = new LinkedList<Integer>();
                forwardDirection = !forwardDirection; 
            }
        }
        return zigZagList;
    }
}