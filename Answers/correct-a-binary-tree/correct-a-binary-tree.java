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
    Set<Integer> set  = new HashSet();
    
    public TreeNode correctBinaryTree(TreeNode root) {
        
        if(root==null)return root;
        
        if(root.right!=null && set.contains(root.right.val)) return null;
        
        set.add(root.val);
    
        root.right=correctBinaryTree(root.right);
        root.left=correctBinaryTree(root.left);
        
        return root;
        
        
    }
}