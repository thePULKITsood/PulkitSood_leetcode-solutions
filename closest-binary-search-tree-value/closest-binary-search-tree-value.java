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
    int ans = 0;
    public int closestValue(TreeNode root, double target) {
        
        double min =(int)1e9;
        close (root,target,min);
        return ans;
    }
   void close(TreeNode root, double target,double min)
    {
        if (root==null)return;
       
       double diff= Math.abs( target - (double) root.val  ) ;
       
        if (diff < min){
            min = diff;
            ans=root.val;
        }
        close(root.left,target,min);
        close(root.right,target,min);
    }
    
}