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
    public boolean isUnivalTree(TreeNode root) {
        
        if (root.left !=null){
            if (root.val != root.left.val )
                return false;
        }
        
        if (root.right !=null){
            if (root.val != root.right.val )
                return false;
        }
        boolean l = true;
        
        boolean r = true;
        if (root.left!=null) l = isUnivalTree(root.left);
         if (root.right!=null) r = isUnivalTree(root.right);
        return l && r ;
    
    }
}