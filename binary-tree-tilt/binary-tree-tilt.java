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
    int totaltilt = 0;
    public int findTilt(TreeNode root) {
         sum (root);
        return totaltilt;
    }
    int sum (TreeNode root){
        if (root==null) return 0;
        
        int left = sum (root.left);
        int right = sum (root.right);
        
        int mytilt = Math.abs(left-right);
        totaltilt += mytilt;
        return (left + right + root.val);
    }
}