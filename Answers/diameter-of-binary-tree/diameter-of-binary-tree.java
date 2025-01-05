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
class Solution {  int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      
        if (root == null )return max;
        func(root);
        return max;
        
        
    }
    
    int  func(TreeNode root ){
        
        if (root == null) return -1;
        
        int lh = func(root.left);
        int rh = func(root.right);
                
        int mydia = lh + rh + 2;
        max = Math.max(mydia , max);
        
        return Math.max(lh,rh)+1;  
//         i am returning my length

    }
}