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
boolean pfound = false ;
    boolean qfound = false ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode Lca = dfs(root,p,q);
        if (pfound && qfound) return Lca;
        return null;
    }
    
    TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == null ) return null;
        
     TreeNode left = dfs(root.left,p,q);
     TreeNode right  = dfs(root.right,p,q);
        
        if (root == p )
        {
            pfound = true;
            return root;
        }
        
        if (root == q ){
            qfound = true;
            return root;
        }
        
       
        
        if (left !=null && right != null) return root;
         if (left  == null && right == null) return null;
        if (left ==null) return right ;
        else return left;
        }
}