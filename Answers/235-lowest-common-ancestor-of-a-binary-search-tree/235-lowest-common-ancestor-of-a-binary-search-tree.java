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
        
//          the splitting node is the lowest common ancestor 
        
        int r = root.val ;
        int pv = p.val;
        int qv= q.val;
        
//         now if they are both big 
        
        if (pv>r && qv>r  ) return lowestCommonAncestor(root.right,p,q);
        
//         if they both are small 
        
        else if (pv<r && qv<r ) return lowestCommonAncestor (root.left ,p,q);
        
//         else means they split here so this must be the last node 
        else return root;
        
        
    }
}