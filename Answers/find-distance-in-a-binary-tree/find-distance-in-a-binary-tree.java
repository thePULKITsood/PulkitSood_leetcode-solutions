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
    public int findDistance(TreeNode root, int p, int q) {
        TreeNode lca = LCA (root,p,q);
        return dis(lca,p,0) + dis (lca,q,0);
        
    }
    public TreeNode  LCA (TreeNode root, int p, int q) {
        if (root == null)return null;
        
        TreeNode left = LCA (root.left,p,q);
        TreeNode right = LCA (root.right,p,q);
        
         
        if (left != null &&right != null)
            //means i have found the lca return the Lca 
                return root;
        if (root.val == p || root .val == q)
            return root;
        
        return left == null ? right : left;
    }
    public int dis (TreeNode root , int tar , int travel ){
        if (root == null){
            return -1;
        }
        if (root.val ==tar){
            return travel;
        }
        int travelleft = dis(root.left,tar,travel+1);
        
        int travelright = dis(root.right,tar,travel+1);
        
        return travelleft == -1 ? travelright : travelleft;
        
    }
}