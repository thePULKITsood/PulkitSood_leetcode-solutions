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
class Solution 
{
    int overdia = Integer.MIN_VALUE;  // not Math. but Integer.
  
    public int diameterOfBinaryTree(TreeNode root) 
    {
        d (root);
        return overdia;   
    }
        
    public int d (TreeNode root)
    {
        
            if (root == null)
        {
            return 0 ;
        }
        
        int left = d (root.left);
        int right = d(root.right);
        
        int mydia = left+right ;
        
        overdia = Math.max(mydia,overdia);
        
    
        return Math.max(left,right) + 1 ;
   }
}

    
    