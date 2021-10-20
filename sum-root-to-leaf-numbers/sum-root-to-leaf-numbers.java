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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        func(0,root);
        return ans;
        
    }
    void func (int sum,TreeNode root ){
        
        sum= sum*10 + root.val;
        if(root.left==null && root.right==null)
            ans+=sum;
        
        if(root.left!=null)
            func(sum,root.left);
        
        if(root.right!=null)
            func(sum,root.right);
    }
}