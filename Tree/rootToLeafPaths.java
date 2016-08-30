/*Given a binary tree, return all root-to-leaf paths.*/

//Solution with String

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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        String path = "";
        
        if(root!=null)
            rootToLeaf(root,path,result);
            
        return result;
    }
    
    private void rootToLeaf(TreeNode root, String path, List<String> result){
        
        if(root.left==null && root.right==null)
            result.add(path+root.val);
            
        if(root.left!=null)
            rootToLeaf(root.left,path+root.val+"->",result);
            
        if(root.right!=null)
            rootToLeaf(root.right,path+root.val+"->",result);
        
    }
}