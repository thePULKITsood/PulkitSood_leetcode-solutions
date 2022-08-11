/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        //first approach i am going touse is of validate with the range 
        return validate(root,null,null);
        
        
    }
    public boolean validate(TreeNode root, Integer max , Integer min){
        if (root == null) return true ;
        
        if (max != null && root.val >= max )return false;
        if (min != null && root.val <= min) return false;
        
        return( validate(root.left,root.val,min) && validate(root.right,max,root.val));
    }
}