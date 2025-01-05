/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
//         we think this in terms of one node 
        
//         if that one node == null we return null 
        if (root == null ) return null;
        
//         if the node == p or  q we retrurn the node and as p and q nodes are diff so we can use or 
        if (root == p || root ==q) return root;
        
//         now we perform a search from the node which is we search the left subtree and the right subtree 
//         they will have either of 2 values 
//         - null - meaning we reached the leaf during recursion dfs and we did not find p or q so return null
        
//         if we have a node then we see that we found some value in the subtree 
        
//         now if both the left and right comes out to be some value then we got it it is the lca
//         other wise if only one of themis a value and other is null we we return the value and this will be helpful fot the parent node 
        
        
        TreeNode left =lowestCommonAncestor (root.left , p,q); 
        TreeNode right =lowestCommonAncestor (root.right , p,q);
        
        if (left!=null && right != null )return root ; // this is the lca 
        if (left == null && right == null ) return null ;
        
        if (left == null) return right;
        else return left;
        
    }
}