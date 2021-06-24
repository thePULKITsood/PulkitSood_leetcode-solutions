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
    Integer prev = null;
    public boolean isValidBST(TreeNode root) {
        
        // approach 2 -- using inorder traversal 
        
        // when we traverse a bst the inorder traversal os always in increasing order we can take a prev node and check if the curr node is > that or not 
            
            // first do the left then do the middle then do the right 
    
        return validate(root);
    }
    boolean validate(TreeNode root){
        if (root == null) return true;
        
        if (! validate(root.left))return false;
        
//         left  - > root  -> right 
if (prev !=null && root.val <= prev ) return false;
        
        prev = root.val;
        
        if(! validate(root.right)) return false;
        return true;
        
    }
    
}