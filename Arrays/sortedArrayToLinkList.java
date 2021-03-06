/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.*/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length==0)
            return null;
        
        TreeNode root = convertToBST(nums,0,nums.length-1);
        
        return root;
    }
    
    private TreeNode convertToBST(int[] nums, int low, int high){
        
        if(low>high)
            return null;
            
        int mid = (low + high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToBST(nums,low,mid-1);
        node.right = convertToBST(nums,mid+1,high);
        
        return node;
    }
}