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
     List<Integer> ans = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        help (root);
        return ans;
    }
   void  help (TreeNode root ){
        if (root== null) return ;
        help(root.left);
        ans.add(root.val);
        help(root.right);
    }
}