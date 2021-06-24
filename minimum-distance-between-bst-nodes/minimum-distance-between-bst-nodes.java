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
    Integer prev = null ;
    int ans = Integer.MAX_VALUE;
    
    public int minDiffInBST(TreeNode root) {
     dfsinorder(root);
        return ans;
        
    }
    void dfsinorder (TreeNode root ){
        if (root == null) return ;
        dfsinorder(root.left);
        if (prev !=null){
            int diff = root.val-prev;
            ans = Math.min(ans,diff);
        }
        prev = root.val;
        dfsinorder(root.right);
    }
}